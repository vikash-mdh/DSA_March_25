package LinkedList;

public class ShallowCopyLinkList {
    public static void recur(Node head){
        Node temp = head;
        if(temp == null) return;
//        recur(temp.next); // 60 -> 50 -> 40 -> 30 -> 20 -> 10
        System.out.print(temp.val +" ");
        recur(temp.next); // 10 -> 20 -> 30 -> 40 -> 50 -> 60



    }
//    public static void print(Node head){
//        Node temp = head;
//       while(temp  != null){
//           System.out.println(temp.val);
//           temp = temp.next;
//       }
//    }
    public static void main(String[] args) {
//        Node node = new Node(100);
//        Node temp = node;  // This is the shallow copy
//        Node temp  = new Node(node.val);  // this is the deep copy
//        System.out.println(temp);
//        System.out.println(node);

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;  // 10 -> 20
        b.next = c;  // 10 -> 20 -> 30
        c.next = d;  // 10 -> 20 -> 30 -> 40
        d.next = e;  // 10 -> 20 -> 30 -> 40 -> 50
        e.next = f;  // 10 -> 20 -> 30 -> 40 -> 50 -> 60

         recur(a);
//        print(a);
    }
}
