package HashSet;

import java.util.HashSet;

public class addSameValue {
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>();
        str.add("vikash");
        str.add("vikash");
        str.add("vikash");
        str.add("vikash");
        str.add("vishal");
//        str.remove("vikash");


        System.err.println(str);
        System.err.println(str.size());
    }
}
