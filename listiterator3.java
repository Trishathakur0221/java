import java.util.*;
public class listiterator3 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("anand");
        list.add("rohit");
        list.add("manav");
        list.add("rownit");
        list.add("ram");
        System.out.println("list: " + list);

       Collections.sort(list);// Sort the list in natural order
        System.out.println("Sorted list: " + list);

        ListIterator<String> it = list.listIterator();
        
        // Forward iteration
        while (it.hasNext()) {
            String data = it.next();
            System.out.println(data);
            
        }
        System.out.println("After forward iteration: " + list);
    }
        
}

