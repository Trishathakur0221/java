public class twentymay {
    public static void main(String[] args) {
        
    int arr[]={-5,-3,0,1,2,3};
    int index=0;
    int newarr[]=new int[arr.length];
    for(int i=0;i<arr.length;i++){
        if(arr[i]<0){
            newarr[index]=arr[i];
            index++;
        }
        for(int j=0;j<arr.length;j++){
           if(arr[j]==0){
            newarr[index]=arr[j];
           }
        for(int k=0;k<arr.length;k++){
            if(arr[k]>0){
                newarr[index]=arr[k];
            }
        }
    }
}
    }
}
