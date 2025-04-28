import java.util.Scanner;
public class evenoddbtwtwo {
   static void even(int s,int e)
   {
        for(int i=s+1;i<e;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
   }

    public static void main(String[] args) {

       Scanner sc =new Scanner (System.in) ;
       
         System.out.println("Enter the inital limit:");
         int s= sc.nextInt();
            System.out.println("Enter the final limit:");
            int e = sc.nextInt();
       even(s,e);
    }
    
    
}
