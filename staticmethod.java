public class staticmethod {
   static void sum(){     //if static is written in front of the method, then it is a static method.
        // static method can be called without creating an object of the class.
       String str= "hello";
         System.out.println(str);
    }
    public static void main(String[] args) {
       // System.out.println("hello");
        sum();
        
    }
    
}
