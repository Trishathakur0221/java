import java.util.*;
public class calculator {

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first number");
        int a = input.nextInt();
        System.out.println("enter your sceond number");
        int b= input.nextInt();
        System.out.println("enter your command");
        char c= input.next().charAt(0);
        switch(c)
        {
            case '+' :
            System.out.println("a+b");
            case '-':
            System.out.println("a-b");
            case '*':
            System.out.println("a*b");
            case '/':
            System.out.println("a/b");
            default:
            System.out.println("invalid");

        }
    }
    
}
