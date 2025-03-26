package LinkedList;




class SingLinkList{
   private Node head;
   private Node tail;
   private int size;

    void insertatTail(int val){
      Node temp = new Node(val);
      if(head == null){
          head = tail = temp;   // if head is empty fir assine tail car denga aur
      }else{
          tail.next = temp;  // tail ko last node say assine carwa denga
          tail = temp;  // last node may temp ko dal denga
      }
      size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null)
            head = tail = temp;
        else{
            temp.next = head; //  temp ko head say conect carewa denga to hemp head ko allocate carega
            head = temp;      // fir head may temp ko assine car denga
        }
        size++;
    }
    void insertIndex(int idx, int val){
        if(idx == 0){
            insertAtHead(val); // in case head index zero ho to return
            return;
        }
        if(idx == size){
            insertatTail(val);
            return;
        }
        if(idx > size || idx < 0){
            System.out.println("Invalid index");
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i = 1; i < idx - 1; i++){
            x  = x.next;
        }
        temp.next = x.next;
        x.next = temp;

        size++;
    }
    int get(int idx) throws Error{
        if(idx == size - 1){
            return tail.val;
        }
        if(idx >= size || idx < 0){
            throw new Error("Dekh Bhai Glat Index Dal Raha hai Sahi index Dalo Yarr");
//            return -1;
        }
        Node temp = head;
        for(int i = 1; i <= idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx,int val) throws Error{
        if(idx == size - 1){
            tail.val = val;
        }
        if(idx >= size || idx < 0){
            throw new Error("Dekh Bhai Glat Index Dal Raha hai Sahi index Dalo Yarr");
//            return -1;
        }
        Node temp = head;
        for(int i = 1; i <= idx; i++){
            temp = temp.next;
        }
         temp.val = val;
    }
    void deleteHead() throws Error{
        if(head == null) throw  new Error("List is Empty");
        head = head.next;
        size--;
    }
    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " "); // Print in a single line
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){

        System.out.println("size is this:- " + size);
    }

}

public class ImplementOfLinklist {
    public static void main(String[] args) {
        SingLinkList list = new SingLinkList();
        list.insertatTail(10);
        list.insertatTail(20);
        list.insertatTail(30);
        list.insertatTail(40);
        list.insertatTail(50);
        list.insertAtHead(45);
        list.insertAtHead(85);
        list.insertIndex(4,500);
        list.insertIndex(5,400);
        list.set(6,49);
        list.display();
        list.size();
        list.deleteHead();
        list.display();
        list.size();
        System.out.println(list.get(4));
        System.out.println(list.get(3));





    }
}
