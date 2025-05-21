public class BinarySearch {
 public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;
        int result = binarySearch(arr, key);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
