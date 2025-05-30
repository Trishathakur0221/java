import java.util.Iterator;
import java.util.*;
public class listiterater {
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

      if(name.startsWith("r")) {
        iterator.remove(); // Remove elements starting with 'R'
      }
     
    }
    System.out.println(list);
}
}
