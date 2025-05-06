class student {
    student(){
        System.out.println("hello");
    }
    student(int a){
        this(); // calling the default constructor
        System.out.println(a );
    }
    student(int a, int b){
        this(a); // calling the constructor with one parameter
        System.out.println(a+b );
    }
    
}
public class constructorchaining {
    public static void main(String[] args) {
        student obj = new student(1,2); // calling the constructor with three parameters
    }
    
}
