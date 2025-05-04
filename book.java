class bookdetails{
    String title;
    String author;
    int price;
    
    void discount(){
        int discount=price-(price*discount/100);
        System.out.println("Discounted price: " + discount);
    }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: "  + price);
    }
}
public class book {
    public static void main(String [] args){
        bookdetails obj1=new bookdetails();
        obj1.title="The Alchemist";
        obj1.author="Paulo Coelho";
        obj1.price=299;
        obj1.display();
        void discount();
        
    }
}
