public class Linearsearch {
     static void linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
    }
    public static void main(String[] args) {
        int arr[] = {22,4,7,6,3,0,12};
        int key = 7;
        linearSearch(arr, key);
    }
}
