class A {
    void display() {
        System.out.println("Class A");
    }
}
class B {
    void display() {
        System.out.println("Class B");
    }
}

public class multipleinheritance extends A{
    public static void main(String[] args) {
        multipleinheritance obj = new multipleinheritance();
        obj.display();
    }
    
}
