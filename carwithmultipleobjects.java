class car{
    String model;
    String brand;
    int price;
    void display(){
        System.out.println("Model " +model);
        System.out.println("Brand " +brand);
        System.out.println("Price " +price);
    }
}
public class carwithmultipleobjects {
    public static void main(String [] args){
        car obj1=new car();
        obj1.model="Model S";
        obj1.brand="Tesla";
        obj1.price=779999;
        obj1.display();
        
        car obj2=new car();
        obj2.model="Mustang";
        obj2.brand="Ford";
        obj2.price=555999;
        obj2.display();
        
        car obj3=new car();
        obj3.model="Civic";
        obj3.brand="Honda";
        obj3.price=250000;
        obj3.display();
        
       
    }

    
}
