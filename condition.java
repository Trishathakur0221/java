import java.util.*;
public class condition {
    public static void main(String [] args){
     Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of elements in the array: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b)
        
            System.out.println("equal");
            else if(a>b)
                System.out.println("a is greater than b");
            
            else
                System.out.println("b is greater than a");
            
        

    }
    
}
