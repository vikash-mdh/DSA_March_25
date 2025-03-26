package LinkedList;
class Solution {
    public void deleteNode(Node node) {
        if (node == null || node.next == null) {
            throw new IllegalArgumentException("Cannot delete the last node with this method");
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}



