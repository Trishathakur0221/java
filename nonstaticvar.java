public class nonstaticvar {
    int a=123;
    public static void main(String[] args) {
        nonstaticvar obj = new nonstaticvar(); // creating an object of the class
        System.out.println(obj.a); // accessing the non-static variable using the object
    }
    
}
