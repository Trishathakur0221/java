public class reversestr {
    public static void main(String[] args) {
        String str = "trishathakur";
        System.out.println(str);
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
    
}
