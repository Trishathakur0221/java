public class class_demo {
    
        public static void main(String [] args)
    {
         class_demo cd = new class_demo();
         cd.show();
         cd.add(10,20);
    }
     public void show()
     {
        System.out.println("show function call");
     }
     public void add(int a, int b)
     {
        System.out.println(a+b);
     }   
}
