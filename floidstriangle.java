import java.util.Scanner;
public class floidstriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int num = 1;
        //outer loop for number of rows
        for (int i = 1; i <= n; i++) {
            //inner loop for number of columns
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
