public class mergearray {
    public static void main(String[] args) {
        int [] arr1= {1,2,3,4};
        int [] arr2= {5,6,7,8};
        int [] arr3= new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]= arr1[i];
       }
       for(int j=0;j<arr2.length;j++){
            arr3[j]=arr2[i+j];
       }
       for(int i=0;arr3.length;i++){
        System.out.println(arr3);
       }
    }
    
}
