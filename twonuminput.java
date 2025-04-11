 import java.util.*;
    public class twonuminput
     {
    public static void main(String [] args)
    {
     Scanner input = new Scanner(System.in);
     System.out.println("enter your first number");
     int a = input.nextInt();
        System.out.println("enter your sceond number");
        int b= input.nextInt();
        if(a>b)
        System.out.println("a is greater");
        else
        System.out.println("b is greater");

    }
}
