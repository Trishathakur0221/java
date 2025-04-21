
   // import java.util.Scanner;
    public class pattern7
{

    public static void main(String[] args)
    {
   // Scanner in= new Scanner(System.in);
    //System.out.println("enter the number");
   // int n=in.nextInt();
  
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
               
            }
            for(int k=1;k<=i;k++){ //k=0,k<i,k++
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
 
}
