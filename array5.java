public class array5 {
    public static void main(String [] args){
    int [] arr1={1,2,3,4,5};
    int [] arr2={6,7,8,9,3};
    int sum=0;
    for(int k=0;k<arr1.length;k++){
        sum=sum+arr1[k];
    }
    System.out.println(sum);
     int sum1=0;
     for(int j=0;j<arr2.length;j++){
        sum1=sum1+arr2[j];
     }
     System.out.println(sum1);
     int res=sum1+sum;
       System.out.println(res);
    }  
}
