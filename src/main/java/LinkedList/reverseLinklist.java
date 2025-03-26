package LinkedList;

public class reverseLinklist {class Solution {
    Node reverseList(Node head) {
        if(head == null) return null;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}

//    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head)
//    {
//
//
//
//    }


}
