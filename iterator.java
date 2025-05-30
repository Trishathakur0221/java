//iterator works in single direction
// This code demonstrates how to use an Iterator to traverse a list and remove elements based on a condition.
//arraylist limkedlist vector 
import java.util.Iterator;
import java.util.*;

public class iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("anand");
        list.add("rohit");
        list.add("sachin");
        list.add("rownit");
        System.out.println("list: " + list);
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);

            if (name.startsWith("r")) {
                iterator.remove(); // Remove elements starting with 'R'
            }

        }
        System.out.println(list);
    }
}
