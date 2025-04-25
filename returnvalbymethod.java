public class returnvalbymethod {
    static int sum(int a,int b){    
        return a+b; // return the sum of a and b
    }
    public static void main(String[] args) {
        int a=10;
        int b=7;
        int c=sum(a,b); // call the sum method and store the result in c
        System.out.println(c); // print the result
    }
    
}
