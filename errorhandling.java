import java.util.*;

public class errorhandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int a=10;
        // int b=0;
        try {
            int c = a / b;
            // one try block can have multiple catch block
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println("we cannot divide by 0");
            System.out.println(e);
        } finally {
            System.out.println("my name is trisha thakur");
        }
        System.out.println("hello");
        System.out.println("hii");

    }
}
