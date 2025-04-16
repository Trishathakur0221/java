
    import java.util.Scanner;
    public class array4{
        public static void main(String [] args){
    Scanner in= new Scanner(System.in);//creating object for input
    System.out.println("enter the size of arr");
    int n=in.nextInt();//size declaration of array  
    int [] arr=new int [n];// Array declaration
     System.out.println("enter the value of arr");
     for(int i=0;i<n;i++){
        arr[i]= in.nextInt();

    }
     int sum=0;
   for(int k=0;k<arr.length;k++){
    sum=sum+arr[k];
   }
   System.out.println(sum);

    }
    
}
