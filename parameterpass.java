public class parameterpass {
    static void may(int a){
      
        int sum=0;
        for(int i=a;i>0;i/=10){
           int rem= i%10;
          
           sum=sum+rem;
 }
         System.out.println(sum);}
    
    public static void main(String[] args) {
       // int b=123;
        may(123); // calling the static method may
    }
}
    

