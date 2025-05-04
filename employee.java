class employeedetails{
        String name;
        int id;
        int salary;
        int increment=10% // increment value for the salary{
            salary=salary+increment; 
            System.out.println("New Salary: " + salary);
        
       
    void display(){
        System.out.println("Name: " + name); 
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
public class employee {
    public static void main(String[] args) {
        employeedetails obj=new employeedetails();
        obj.name="John Doe"; 
        obj.id=101;
        obj.salary=50000.0; 
        obj.display(); 
        
    }
}

