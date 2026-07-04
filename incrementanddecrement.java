public class incrementanddecrement {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 5;
        // b = a++; // Post-increment: b gets the value of a (10), then a is incremented to 11
        // System.out.println(a);
        // System.out.println(b);

        int a = 11;
        int b = 12;
        b = ++a; // Pre-increment: a is incremented to 11, then b gets the value of a (11)
        System.out.println(a);
        System.out.println(b);

        int x = 20;
        int y = 15;
        y = x--; // Post-decrement: y gets the value of x (20), then x is decremented to 19
        System.out.println(x);
        System.out.println(y);

        int p = 30;
        int q = 40;
        q = --p; // Pre-decrement: p is decremented to 29, then q gets the value of p (29)
        System.out.println(p);
        System.out.println(q);
    }
}

       
