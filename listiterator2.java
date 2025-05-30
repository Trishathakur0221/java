import java.util.*;
public class listiterator2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(); 
        list.add("anand");
        list.add("rohit");
        list.add("manav");
        list.add("rownit");
        list.add("ram");
        System.out.println("list: " + list);
        ListIterator<String> it = list.listIterator();
        // Forward iteration
        while (it.hasNext()) {
            String data = it.next();
            System.out.println(data);
           if(data.length()<4){
            it.set("bye"); // Replace elements with length greater than 4 with "bye"
           }
        }
        System.out.println("After forward iteration: " + list);
        // Backward iteration
        while (it.hasPrevious()) {
            String data = it.previous();
            System.out.println(data);
            if(!data.equals("anand")){
                it.set("hello");
             }
        }
            
          System.out.println("After backward iteration: " + list);
        
    }
}
