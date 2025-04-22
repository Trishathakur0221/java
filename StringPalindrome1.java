public class StringPalindrome1 {
    public static void main(String[] args) {
        String str = "hello";
        String reversedStr = new StringBuilder(str).reverse().toString();
        
        if (str.equals(reversedStr)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
    
}
