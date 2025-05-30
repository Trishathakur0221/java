//listiterator works on both forward and backward direction

import java.util.*;
public class forbacklistiterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("anand");
        list.add("rohit");
        list.add("sachin");
        list.add("rownit");
        System.out.println("list: " + list);
      ListIterator<String> iterator = list.listIterator();
        // Forward iteration
         while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);

            /*if (name.startsWith("s")) {
                iterator.remove(); 
            }*/
        }
        System.out.println(list);

        // Backward iteration
        while (iterator.hasPrevious()) {
            String name = iterator.previous();
            System.out.println(name);
        }
    }
}
   
 