public class errorhandlingbyarr {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};

        try {
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("we cannot print the index 7");
            System.out.println(e);
        } finally {
            System.out.println("hello world");
        }
        System.out.println("hello");
        System.out.println("hii");
        System.out.println("byee byee");
    }

}
