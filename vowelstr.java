public class vowelstr {
    public static void main(String[] args) {
    String str1= "qewrtyudonsggsjio";
    int count=0;
    char ch;
   for(int i=0;i<str1.length();i++){
       // int count=0;
       // count++;
       // System.out.println(count);

        ch = str1.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
          
            count++;
          //  System.out.println(count);
           // System.out.println("vowel");
        }
        //else{
       //     System.out.println("not vowel");
      //  }

    }
    System.out.println(count);
    }
    
}
