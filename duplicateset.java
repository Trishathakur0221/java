import java.lang.reflect.Array;
import java.util.*;
public class duplicateset {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-7);
        arr.add(1);
        arr.add(5);
        arr.add(8);
        arr.add(8);
        arr.add(8); // Adding a duplicate for demonstration
        System.out.println("ArrayList: " + arr);


        // Using a HashSet to remove duplicates
        Set<Integer> uniqueSet = new HashSet<>(arr);
        System.out.println("Unique Set: " + uniqueSet);
       
        //converting back to ArrayList
        ArrayList<Integer> duplicates = new ArrayList<>(uniqueSet);
                System.out.println("ArrayList after removing duplicates: " + duplicates);
            }
        }

