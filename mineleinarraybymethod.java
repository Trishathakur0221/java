public class mineleinarraybymethod {
    static int may(){
        int a[]={1,2,3,4,5};
        int min=a[0];
        for(int i=0;i<a.length;i++){
        
            if(a[i]<min){
                min=a[i];
            }
         } 
         return min;
        }
         public static void main(String[] args) {
           
           System.out.println(may()); // calling the static method may
       
    }
    

}
