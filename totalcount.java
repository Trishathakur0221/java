public class totalcount {
    public static void main(String[] args) {
        int [] [] arr= {{1,2,3,4},{5,6,7,8}};
        int totalcount=0;
        for(int i=0;i<arr.length;i++){
        totalcount= totalcount+ arr[i].length;
        System.out.println(totalcount);
        }

        int [] arr1= new int [totalcount];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr1[k++]= arr[i][j];
                }
           }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
    
}
