import java.util.Scanner; // import the Scanner class from the java.util package
public class sumofnaturalnum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); // create a Scanner object to read input from the user
        System.out.println("Enter the number: "); // prompt the user to enter a number
        int n = sc.nextInt(); // read the number entered by the user
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
    
    System.out.println("the sum of natural number is: "+sum); // print the sum of natural number from 0 to n
}
}
