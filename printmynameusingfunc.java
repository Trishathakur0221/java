import java.util.*;
public class printmynameusingfunc {
    public static void printmyname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= sc.nextLine();
        printmyname(name);
    }
}
