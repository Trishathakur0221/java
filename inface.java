interface client{
    void show();
    void print();

}
class Devloper implements client{
    public  void show(){
        System.out.println("Hello");
    }
    public void print(){
        System.out.println("World");
    }
}

public class inface {
    public static void main(String[] args) {
        Devloper obj=new Devloper();
        obj.show();
        obj.print();
    }
    
}
