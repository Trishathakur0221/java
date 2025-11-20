import java.util.*;
public class prodoftwonumsingfunc {
    public static int prodoftwonum(int a, int b){
        int prod=a*b;
        return prod;
    }
   public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter first number:");
    int a= sc.nextInt();
    System.out.println("Enter second number:");
    int b= sc.nextInt();
    int result= prodoftwonum(a, b);
    System.out.println("The product of two numbers is: " + result);
   }
}
