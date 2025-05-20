public class cyclicrotationbytwoinarr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
      
        int lastvalue=arr[arr.length-1];
        int secondlastvalue=arr[arr.length-2];
        for(int i=arr.length-1;i>1;i--){
            arr[i]=arr[i-2];
        }
        arr[0]=secondlastvalue;
        arr[1]=lastvalue;
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
    
}
