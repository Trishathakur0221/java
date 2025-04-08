import java.util.*;

public class demo {
public static char ch= 'Z';
private static demo d;
int a,b; 
public demo(int k,int m)
{
a=k;
b=m;
}
public void show()
{

int A=500;
System.out.println(a+"--"+b);
System.out.println(A);
}
public static void main(String args[])
{
demo.d = new demo(10,20);
d.show();
System.out.println(demo.ch);
}
}
