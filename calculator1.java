class calci{
    static void add(int a, int b){
        System.out.println("The sum is: " + (a+b));
    }
    static void sub(int a, int b){
        System.out.println("The difference is: " + (a-b));
    }
    static void mul(int a, int b){
        System.out.println("The product is: " + (a*b));
    }
    static void div(int a, int b){
        System.out.println("The quotient is: " + (a/b));
    }
}
public class calculator1 {
    public static void main(String[] args) {
       calci obj=new calci();
       obj.add(10, 5); 
       obj.sub(10, 5); 
       obj.mul(10, 5); 
       obj.div(10, 5);  
    }
    
}
