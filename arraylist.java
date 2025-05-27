import java.util.*;
public class arraylist {
    public static void main(String [] args){
      ArrayList<Integer> arr = new ArrayList<>();
       arr.add(-7);
       arr.add(1);
       arr.add(5);
       arr.add(8);
       arr.add(-8);

        System.out.println("ArrayList: " + arr);
      // int max = arr.get(0);    
      arr.get(0);
      System.out.println("First element: " + arr.get(0));
      arr.get(2);
        System.out.println("Third element: " + arr.get(2));

        arr.set(1, 10); // Change the second element to 10
        System.out.println("ArrayList after modification: " + arr);
      
        arr.remove(3); // Remove the fourth element (index 3)       
        System.out.println("ArrayList after removal: " + arr);

        arr.clear(); // Clear the ArrayList
        System.out.println("ArrayList after clearing: " + arr);

        

       
    }

}
