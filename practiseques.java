import java.util.Scanner;
public class practiseques {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number: ");
        int a= sc.nextInt();
        System.out.println("enter second number: ");
        int b= sc.nextInt();
        int remainder,divisor,dividend,quotient;
        dividend=a;
        divisor=b;
        quotient= dividend/divisor;
        // divisor*quotient+remainder=dividend;
        remainder= dividend - (divisor*quotient);
        System.out.println("the remainder is " + remainder);
    }
}
