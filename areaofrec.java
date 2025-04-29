class hello{
    int length=4;
    int breadth=9;
    void are(){
        int area=length*breadth;
        System.out.println("Area of rectangle is: "+area);
    }
}
public class areaofrec {
    public static void main(String[] args) {
        hello obj = new hello();
        obj.are(); // call the area method to calculate and print the area of the rectangle
    }
    
  }

