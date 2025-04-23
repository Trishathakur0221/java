public class vowelstr1 {
    public static void main(String[] args) {
       String str1= "abcdefghi";
         for(int i=0;i<str1.length();i++)
        {
         char ch =str1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                System.out.println("Vowel is");
            else
                System.out.println("not vowel is");
        }
   }
}

