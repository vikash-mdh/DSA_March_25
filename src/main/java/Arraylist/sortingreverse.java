package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class sortingreverse {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(30);
        list.add(3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        
    }
}
