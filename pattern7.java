
   // import java.util.Scanner;
    public class pattern7
{

    public static void main(String[] args)
    {
   // Scanner in= new Scanner(System.in);
    //System.out.println("enter the number");
   // int n=in.nextInt();
  
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)<=5)
                System.out.println(" ");
                else
                System.out.print("*");
            }
        }
    }
    
 
}
