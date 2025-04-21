public class array6 {
    public static void main(String [] args){
    int [] arr1={1,2,3,4,5};
    int [] arr2={6,7,8,9,3};
    int[] sum=new int[arr1.length];//
    for(int k=0;k<sum.length;k++){
        sum[k]= arr1[k]+arr2[k];
    }
    for(int k=0;k<sum.length;k++){
      System.out.println(sum[k]);
    }

 }
}

