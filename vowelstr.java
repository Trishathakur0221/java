public class vowelstr {
    public static void main(String[] args) {
    String str1= "qewrtyudonsggsjio";
    int count=0;
   
   for(int i=0;i<str1.length();i++){
    char ch =str1.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        count++;
        System.out.println("Vowel is: "+ch);
        else
        System.out.println("Consonant is: "+ch);
      
   }
  }
}

       