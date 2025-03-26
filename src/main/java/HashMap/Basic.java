package HashMap;


import java.util.HashMap;

public class Basic {
        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();

            // hashmap may duplicate value ho shakti hai but duplicate key nahi ho shakti hai
            map.put("viaksh", 1);
            map.put("deepk", 3);
            map.put("kajal", 34);
            map.put("sopana", 44);
            map.put("sopan", 45);

//            // This iteration on the keyset
//            for(String str : map.keySet()){
//                System.out.print(map.get(str)+" ");
//                System.out.print(str+" ");
//            }

            for(Object pair : map.entrySet()){
                System.out.print(pair +" -> ");
            }

            // This iteration on the values
//            System.out.println();
//            for(int ele : map.values()){
//                System.out.print(ele + " ");
//            }





//
//            System.out.println(map.containsKey("kajal"));
//            map.remove("sopana");
//            System.out.println(map);
//            System.out.println(map.containsValue(45));
//            System.out.println(map);
//            System.out.println(map.containsValue(40));
//            System.out.println(map);
//            System.out.println(map.size());
//            System.out.println(map.get("dipali"));
//            System.out.println(map);

        }
    }

