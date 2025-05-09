class studentdetail{
  private String name;
  private int marks;
  public void setname(String name){
    this.name=name;
  }
  public String getname(){
    return name;
  }
  public void setmarks(int marks){
      this.marks=marks;
  }
  public int getmarks(){
    return marks;
  }

}
public class student {
    public static void main(String[] args) {
        studentdetail obj=new studentdetail();
        obj.setname("trisha");
        obj.setmarks(609);
        System.out.println(obj.getname());
        System.out.println(obj.getmarks());

    }
    
}
