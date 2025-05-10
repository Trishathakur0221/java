class lw{
    private int length;
    private  int width;
    public void setlength(int length){
     this.length=length;
    }
    public int getlength(){
        return length;
    }
    public void getwidth(int width){
        this.width=width;
    }
    public int getwidth(){
        return width;
    }
}
public class rectangle {
    public static void main(String[] args) {
        lw obj=new lw();
        obj.setlength(6);
        obj.setwiidth();
        System.out.println(obj.getlength());
        System.out.println(obj.getwidth());

    }
    
}
