public class vowelstr {
    public static void main(String[] args) {
        String str ="trisha";
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
           switch(str.charAt(i))
           {
               case 'a':
               case 'e':
               case 'i':
               case 'o':
               case 'u':
               System.out.println("Vowel  ");
                   count++;
                   break;
               default:
                   break;
           }
        }
    }
    
}
