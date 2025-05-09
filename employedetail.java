class employee{
     public String name;
     public int id;
  private int salary;
   public void setname(String name){
    this.name=name;
   }
    public String getname(){
        return name;
   }
   public void setid(int id){
    this.id=id;
   }
   public int getid(){
    return id;
   }
   public void setsalary(int salary){
    this.salary=salary;
   }
   public int getsalary(){
     return salary;
   }

   
}
public class employedetail {
    public static void main(String[] args) {
        employee obj=new employee();
        obj.setname("aman");
        obj.setid(123);
        obj.setsalary(50000);
        System.out.println(obj.getname());
        System.out.println(obj.getid());
        System.out.println(obj.getsalary());


    }
    
}
