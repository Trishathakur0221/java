class student{
    String name="joe";
    int age=19;
    
    student(String n, int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
public class constructor {
 public static void main(String[] args) {
    student obj=new student("John", 20);
   
   obj.display();
   

 }
    
}
