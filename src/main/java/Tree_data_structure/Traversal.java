//package Tree_data_structure;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Traversal {
//    public static void main(String[] args) {
//        // Binary Tree is:
//        //       1
//        //      /  \
//        //     2    3
//        //    / \  / \
//        //   4   5 6  7
//
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        Node g = new Node(7);
//
//        a.left = b; a.right = c;
//        b.left = d; b.right = e;
//        c.left = f; c.right = g;
//
//        System.out.print("preOrder : ");
//        preOrder(a);
//        System.out.println();
//        System.out.print("inOrder : ");
//        postOrder(a);
//        System.out.println();
//        System.out.print("postOrder :");
//        inOrder(a);
//        System.out.println();
//        System.out.print("levelOrder : ");
//        levelOrder(a);
//    }
//
//    ///  preOrder root, left, right
//    public static void preOrder(Node root){
//        if(root == null) return;
//        System.out.print(root.val +" ");
//        preOrder(root.left);
//        preOrder(root.right);
//
//    }
//
//
//    ///  postOrder traversal left, right, root
//    private static void postOrder(Node root) {
//        if(root == null) return;
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.print(root.val+" ");
//    }
//
//
//    /// This is the inorder traversal left, root, right
//    private static void inOrder(Node root) {
//        if(root == null) return;
//        inOrder(root.left);
//        System.out.print(root.val+" ");
//        inOrder(root.right);
//
//    }
//
//    ///  This is the levelOrder traversal
//    private static void levelOrder(Node root) {
//        Queue<Node> que = new LinkedList<>();
//        if(root != null){
//            que.add(root);
//        }
//        while(que.size() > 0){
//            Node front = que.poll();
//            System.out.print(front.val +" ");
//            if(root.left != null)
//                que.add(front.left);
//            if(root.right != null){
//                que.add(front.right);
//            }
//        }
//        //System.out.println();
//
//        class Solution {
////            // Function to return list containing elements of right view of binary tree.
////            ArrayList<Integer> rightView(Node root) {
////                ArrayList<Integer> ans = new ArrayList<>();
////                rightSideView(root, ans, 0);
////                return ans;
////            }
//
////            public void rightSideView(Node root, ArrayList<Integer> ans, int curr){
////                if(root ==  null) return;
////
////                if(curr == ans.size()){
////                    ans.add(curr.val);
////                }
////                rightSideView(root.right, ans, curr + 1);
////                rightSideView(root.left, ans, curr + 1);
//
//
//            }
//        }
//
//
//
//
//    }
//
//}
