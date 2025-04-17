public class pattern8 {
    public static void main(String [] args)
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j>=i;j--)
            {
             if(j-i>=5)
             System.out.println("");
             else
             System.out.println("*");
           }
       }
    
    }
}
