class atm{
    private int a;
    public void setRupees(int a){
        this.a=a;

    }
public int getRupees(){
    return a;
 }

}
public class accessspecifier {
    public static void main(String[] args) {
        atm obj=new atm();
        obj.setRupees(500);
       System.out.println(obj.getRupees());
    }
    
}
