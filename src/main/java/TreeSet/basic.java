package TreeSet;

import java.util.TreeSet;
import java.util.*;

public class basic {
        public static void main(String[] args) {
            // Creating a TreeSet
            TreeSet<Integer> set = new TreeSet<>();

            // Adding elements
            set.add(10);
            set.add(5);
            set.add(20);
            set.add(15);
            set.add(25);
            System.out.println("TreeSet: " + set); // Output: [5, 10, 15, 20, 25]

            // Removing elements
            set.remove(10);
            System.out.println("After removing 10: " + set);

            // Checking existence
            System.out.println("Contains 15? " + set.contains(15));

            // Retrieving first and last elements
            System.out.println("First: " + set.first());
            System.out.println("Last: " + set.last());

            // Finding lower, higher, floor, and ceiling elements
            System.out.println("Lower than 15: " + set.lower(15)); // < 15
            System.out.println("Higher than 15: " + set.higher(15)); // > 15
            System.out.println("Floor of 18: " + set.floor(18)); // ≤ 18
            System.out.println("Ceiling of 18: " + set.ceiling(18)); // ≥ 18

            // Removing first and last elements
            System.out.println("Poll First: " + set.pollFirst());
            System.out.println("Poll Last: " + set.pollLast());
            System.out.println("TreeSet after polling: " + set);

            // Iterating through TreeSet
            System.out.println("Iterating TreeSet:");
            for (Integer num : set) {
                System.out.println(num);
            }

            // Using Iterator
            Iterator<Integer> itr = set.iterator();
            System.out.println("Using Iterator:");
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

            // Descending order iteration
            System.out.println("Descending order:");
            Iterator<Integer> descItr = set.descendingIterator();
            while (descItr.hasNext()) {
                System.out.println(descItr.next());
            }

            // Subsets operations
            System.out.println("SubSet (5 to 20): " + set.subSet(5, 20)); // Exclusive of 20
            System.out.println("HeadSet (less than 15): " + set.headSet(15));
            System.out.println("TailSet (greater than or equal to 15): " + set.tailSet(15));

            // Checking size and emptiness
            System.out.println("Size: " + set.size());
            System.out.println("Is Empty? " + set.isEmpty());

            // Clearing the TreeSet
            set.clear();
            System.out.println("After clear, is Empty? " + set.isEmpty());

            // TreeSet with Custom Comparator (Descending Order)
            TreeSet<Integer> descendingSet = new TreeSet<>((a, b) -> b - a);
            descendingSet.add(10);
            descendingSet.add(5);
            descendingSet.add(20);
            System.out.println("Custom Comparator (Descending Order): " + descendingSet);
        }
    }


