package TreeMap;
import java.util.*;
public class basicoperation {
        public static void main(String[] args) {
            TreeMap<Integer, String> map = new TreeMap<>();

            // Adding elements
            map.put(3, "Apple");
            map.put(1, "Mango");
            map.put(2, "Banana");
            System.out.println("TreeMap: " + map);

            // Removing elements
            map.remove(2);
            System.out.println("After removing 2: " + map);

            // Checking key and value existence
            System.out.println("Contains key 1? " + map.containsKey(1));
            System.out.println("Contains value 'Apple'? " + map.containsValue("Apple"));

            // Retrieving values
            System.out.println("Value of key 1: " + map.get(1));

            // Getting first and last entries
            System.out.println("First Entry: " + map.firstEntry());
            System.out.println("Last Entry: " + map.lastEntry());

            // Getting lower, higher, floor, and ceiling keys
            System.out.println("Lower than 3: " + map.lowerKey(3));
            System.out.println("Higher than 1: " + map.higherKey(1));
            System.out.println("Floor of 2: " + map.floorKey(2));
            System.out.println("Ceiling of 2: " + map.ceilingKey(2));

            // Iterating over TreeMap
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }


