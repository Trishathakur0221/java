public class duplicatestring {
    public static void main(String[] args) {
        String str= "cchhaaiipplloo";
        String newstr="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(newstr.indexOf(ch)==-1){
                newstr=newstr+ch;
              
            }
            
        }
        System.out.println(newstr);
    }
}

       


