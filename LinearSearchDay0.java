class LinearSearchDay0 {
    public static void main(String[] args) {
        int sampleArr[] = { 1, 5, 9, 3, 7, 4, 2, 6, 0 };
        int find = 0;
        int result = searchNow(sampleArr, find);

        if (result == -1) {
            System.out.println("Given number is not present");
        } else {
            System.out.printf("%d is present at position " + result + " .", find);
        }
    }

    public static int searchNow(int arr[], int x) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return x;
    }
}
