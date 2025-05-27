public class subarr {
    public static void main(String[] args) {
        int arr[]={ -7,1,5,8,-8};
        int max=arr[0];
     try
    {
        
        for(int i=0;i<arr.length;i++){
        int sum=0;
       
        for(int j=i;j<arr.length;j++){
           sum +=arr[j];
           if(sum>max){
           max=sum;
        }
    }
}
System.out.println(max);
}catch (Exception e){
    System.out.println("array index out of bound");
}
     System.out.println("hello");
    }
}
   
