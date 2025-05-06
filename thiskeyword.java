 class student {
    int a;
    student(int a){
        this.a=a; // this keyword is used to refer to the current object
    }
    void display(){
        System.out.println( a);
    }

}
public class thiskeyword {
    public static void main(String[] args) {
        student obj=new student(10);
        obj.display();
    }
    
}
