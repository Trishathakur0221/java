public class matchstr {
    public static void main(String[] args) {
      String  str ="hello";
      String str1= "hii";
     int count =0;
      for(int i=0;i<str.length();i++){
          for(int j=0;j<str1.length();j++){
              if(str.charAt(i)==str1.charAt(j)){
                      count++;
                     }
            
          }
      }
      System.out.println(count);

    }
}
