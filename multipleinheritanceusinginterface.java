
interface client1 {
    void show();

    void print();
}

interface client2 {
    void show();

}

class Devloper implements client1, client2 {
    public void show() {
        System.out.println("Hello");
    }

    public void print() {
        System.out.println("World");
    }
}

public class multipleinheritanceusinginterface {
    public static void main(String[] args) {
        Devloper obj = new Devloper();
        obj.show();

    }

}
