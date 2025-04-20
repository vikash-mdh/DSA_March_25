package Tree_data_structure;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

public class BasicTree {
    public static void main(String[] args) {
        // Binary Tree is:
        //       1
        //      /  \
        //     2    3
        //    / \  / \
        //   4   5 6  7
        //          \
        //           8
        Node a = new Node(1);
        Node b = new  Node(2);
        Node c = new  Node(3);
        Node d = new Node(4);
        Node e = new  Node(5);
        Node f = new  Node(6);
        Node g = new  Node(7);
        Node h = new  Node(8);
         a.left = b;
         a.right = c;
         b.left = d;
         b.right = e;
         c.right = f;
         c.left = g;
         f.right = h;
        // display(a);
        System.out.println();

        //System.out.println("Sum of all the nodes is: "+sumof(a));
       // System.out.println("Product of all the nodes is:"+ productBT(a));
       // System.out.println("find the maximum values " + max(a));
       // System.out.println("find the minum values " + min(a));
      //  System.out.println("find the minum values " + size(a));
        System.out.println("find the level of binary tree " + levels(a));

    }
    public static void display(Node root){
        if(root == null) return; // this is my base case
        System.out.print(root.val+" ");   // this is my root node
        display(root.left);    // this is the leftsub tree
        display(root.right);  // this is the rightsub tree
    }

    static int sumof(Node root) {
        if(root ==  null) return 0;
        int sum = 0;
        sum += root.val + sumof(root.left)+sumof(root.right);  // calculate the sum
        return sum;
    }

   private static int productBT(Node root){
        if (root == null) return 1;
        return (root.val * productBT(root.left) * productBT(root.right));  // multiplication
    }

   public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int top = root.val;
        int left = max(root.left);
        int right = max(root.right);

        return Math.max(top,Math.max(left, right));
   }
    public static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        int left = max(root.left);
        int right = max(root.right);
        return Math.min(root.val,Math.min(left, right));
    }

    public static int size(Node root){
        if(root == null) return 0;
        int left = size(root.left);
        int right = size(root.right);
        return 1 + left + right;
    }

    public static  int levels(Node root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));

//        int left = levels(root.left);
//        int right = levels(root.right);
//        return 1 + Math.max(left,right);
    }

}

