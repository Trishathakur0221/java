public class nonstaticmethod {
    void sum(){     //if static is not written in front of the method, then it is a non-static method.
        // non-static method can be called only after creating an object of the class.
       String str= "hello";
    }
    public static void main(String[] args) {
        System.out.println("hello");
        //creating an object of the class
         nonstaticmethod obj = new nonstaticmethod();
        obj.sum(); 
    }
    
}
