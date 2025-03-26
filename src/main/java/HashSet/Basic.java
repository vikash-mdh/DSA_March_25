package HashSet;

import java.sql.SQLOutput;
import java.util.HashSet;

public class Basic {
    public static void main(String[] args) {
        // Hashset ki under random order may valaue insert hota hai ye secunce nahi follow cata hai
        HashSet<Integer> set = new HashSet<>();
        // INSERT TC - 0(1)
        set.add(20); // this function add the element is the hashset
        set.add(40);
        set.add(50);
//        set.remove(50);
        System.out.println(set);
        set.add(70);
        set.add(100);
        Object[] arr = set.toArray();

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        // cheeck the size of hashset
        System.out.println(set);
        System.out.println(set.size());
        // serch if present then true / otherwise false TC - 0(1)
        System.out.println(set.contains(9)); // this contains functon cheeck element is present or not
        System.out.println(set.contains(100));



    }
}
