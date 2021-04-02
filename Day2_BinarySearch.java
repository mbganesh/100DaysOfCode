import java.util.Arrays;

public class Day2_BinarySearch {
    public static void main(String[] args) {
        // init variables
        int myArr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 45, 78, 999, 6589, 35800, 12484 };
        int myArrLen = myArr.length;
        // int myTarget = 90; // checking
        int myTarget = 12;
        int myLowerBound = 0;
        int myHigherBound = myArrLen;
        // is Present?
        while (myLowerBound <= myHigherBound) {
            int myMidPoint = myLowerBound + (myHigherBound - myLowerBound) / 2;
            // case 1:
            if (myArr[myMidPoint] == myTarget) {
                System.out.println("Element found at " + myMidPoint);
                break; // must use at printing statements
            }
            // case 2:
            if (myArr[myMidPoint] > myTarget) {
                myHigherBound = myMidPoint - 1;
            }
            // case 3:
            if (myArr[myMidPoint] < myTarget) {
                myLowerBound = myMidPoint + 1;
            }
        }
        // is Not present?
        if (myHigherBound < myLowerBound) {
            System.out.println("Element not present in given array!");
        }

        // using inbuilt function
        System.out.println("Pos : " + Arrays.binarySearch(myArr, myTarget)); // Arrays.binarySearch(arr,key)
    }
}
/*
 * Procedure binary_search A ← sorted array n ← size of array x ← value to be
 * searched
 * 
 * Set lowerBound = 1 Set upperBound = n
 * 
 * while x not found if upperBound < lowerBound EXIT: x does not exists.
 * 
 * set midPoint = lowerBound + ( upperBound - lowerBound ) / 2
 * 
 * if A[midPoint] < x set lowerBound = midPoint + 1
 * 
 * if A[midPoint] > x set upperBound = midPoint - 1
 * 
 * if A[midPoint] = x EXIT: x found at location midPoint end while
 * 
 * end procedure
 */
