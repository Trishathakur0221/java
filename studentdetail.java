class student{
    String name;
    int rollno;
    float marks;
    void details(){
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollno);
        System.out.println("Marks: "+marks);
    }

}
public class studentdetail {
    public static void main(String[] args) {
        student obj=new student();
        obj.name="william";
        obj.rollno=123;
        obj.marks=89f;
        obj.details(); 
        obj.name="John Doe";
        obj.rollno=12;
        obj.marks=49f;
        obj.details();
        obj.name="Jane Smith";
        obj.rollno=12;
        obj.marks=49f;
        obj.details();

    }
    
    
}
