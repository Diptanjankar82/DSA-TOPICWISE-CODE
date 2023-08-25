public class maxInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int[] maxi = {Integer.MIN_VALUE}; // Array to hold the maximum value

        findMaxRecursive(arr, n, maxi, 0);
        System.out.println("Max value in the array: " + maxi[0]);
    }

    public static void findMaxRecursive(int arr[], int n, int[] maxi, int index) {
        if (index == n) {
            return;
        }
        maxi[0] = Math.max(maxi[0], arr[index]);
        findMaxRecursive(arr, n, maxi, index + 1);
    }

}
