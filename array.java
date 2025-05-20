public class array {
    public static void main(String[] args) {
        int arr[]={-5,-3,0,1,2,3};
    for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            System.out.println("Zero found at index: "+i);
        }
        else if(arr[i]<0){
            System.out.println("Negative number found at index: "+i);
        }
        else{
            System.out.println("Positive number found at index: "+i);
        }
      int newarr[]=new int[arr.length];
        for(int j=0;j<arr.length;j++){
            newarr[j]=arr[j];
        }
    }
  }
}
