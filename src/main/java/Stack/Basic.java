package Stack;

import java.util.Stack;

public class Basic {
//    A Stack is a linear data structure that follows the LIFO (Last In, First Out) principle.
//    This means that the last element inserted into the stack is the first one to be removed.

//    Push(x): Inserts element x on top of the stack.
//    Pop(): Removes and returns the top element of the stack
//    Peek() / Top(): Returns the top element without removing it.
//    isEmpty(): Checks if the stack is empty.
//    isFull(): (For fixed-size stacks) Checks if the stack is full.


    public static void main(String[] args) {
       Stack<Integer> st = new Stack<>();
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
       System.out.println(st);
        System.out.println(st.size());
        while(st.isEmpty()){
            st.pop();
        }
        System.out.println(st.peek());

    }

}
