class circle{
    static void area(int a){
        double area=3.14*a*a;
        System.out.println("Area of circle is: "+area);
    }
    static void circumference(int a){
        double circumference=2*3.14*a;
        System.out.println("Circumference of circle is: "+circumference);
    }


}
public class areaandcircumferenceofcircleusingmethod {
    public static void main(String[] args) {
        circle obj=new circle();
        obj.area(6);
        obj.circumference(9); // call the area and circumference methods to calculate and print the area and circumference of the circle
    }
    
}
