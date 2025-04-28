public class productofnaturalnum {
    static void prod(int a, int b){
        int c=a*b;
        System.out.println(c); // print the product of a and b
    }
    public static void main(String [] args){
        int prod=1;
        for(int i=1;i<=5;i++){
            prod=prod*i; // calculate the product of natural numbers from 1 to n
        }
        System.out.println(prod);
        prod(10,20);
    }
    
}

    

