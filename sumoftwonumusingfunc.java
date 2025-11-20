import java.util.*;
public class sumoftwonumusingfunc {
    public static int sumoftwonum(int a, int b){
        int sum= a + b;
        return sum;
    }
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int a= sc.nextInt();
        System.out.println("Enter second number:");
        int b= sc.nextInt();
        int result= sumoftwonum(a, b);
        System.out.println("The sum of two numbers is: " + result);
    }
}
