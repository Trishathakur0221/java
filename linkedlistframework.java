import java.util.LinkedList;
import java.util.*;
public class linkedlistframework {
    public static void main(String [] args){
       LinkedList<Integer> list = new LinkedList<>();
        list.add(-7);
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(-8);

        System.out.println("LinkedList: " + list);
        list.get(0);
        System.out.println("First element: " + list.get(0));

        list.get(2);
        System.out.println("Third element: " + list.get(2));

        list.set(1, 10); // Change the second element to 10
        System.out.println("LinkedList after modification: " + list);

        list.remove(3); // Remove the fourth element (index 3)
        System.out.println("LinkedList after removal: " + list);

        list.clear(); // Clear the LinkedList
        System.out.println("LinkedList after clearing: " + list);

    }
    
}
