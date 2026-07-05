import java.util.HashMap;
import java.util.*;

class Node {

    int key;
    String value;
    Node next;

    Node(int key, String value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashMap {

    Node[] buckets = new Node[5];

    private int hash(int key) {
        return key % buckets.length;
    }

    public void put(int key, String value) {

        int index = hash(key);

        Node newNode = new Node(key, value);

        if (buckets[index] == null) {
            buckets[index] = newNode;
            return;
        }

        Node temp = buckets[index];

        while (true) {

            if (temp.key == key) {
                temp.value = value;
                return;
            }

            if (temp.next == null)
                break;

            temp = temp.next;
        }

        temp.next = newNode;
    }

    public String get(int key) {

        int index = hash(key);

        Node temp = buckets[index];

        while (temp != null) {

            if (temp.key == key)
                return temp.value;

            temp = temp.next;
        }

        return null;
    }
}

public class hashmapimple {

    public static void main(String[] args) {

        MyHashMap map = new MyHashMap();

        map.put(10, "Rahul");
        map.put(15, "Aman");
        map.put(20, "Priya");

        System.out.println(map.get(10));
        System.out.println(map.get(15));
        System.out.println(map.get(20));
    }
}
