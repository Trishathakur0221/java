interface A{
    void display();
}
interface B{
    void display();
}
class demo implements A,B{
    public void display(){
        System.out.println("Class C");
    }
 
}

public class AB {
    public static void main(String[] args) {
        demo obj=new demo();
        obj.display();
        obj.display();
        //obj.display();

    }
    
}
