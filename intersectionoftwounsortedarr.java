public class intersectionoftwounsortedarr {
    public static void main(String[] args) {
      int arr[]={1,2,3,4,5};
      int arr1[]={2,3,5,7,9};
              for(int i =0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
     }
    
}
