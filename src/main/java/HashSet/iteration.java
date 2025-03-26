package HashSet;

import java.util.HashSet;

public class iteration {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(15);
        set.add(50);
        set.add(70);
        set.add(40);
        set.add(10);
        set.add(20);
        System.out.println(set);
//        set.clear();
        set.add(30);
        System.out.println(set);
        set.add(30);
        System.out.println(set);
    }
}
