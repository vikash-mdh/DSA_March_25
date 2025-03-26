package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



//Add (end) → add(E e)
//Get (index) → get(int index)
//Set (index) → set(int index, E element)
//Remove (index) → remove(int index)
//Remove (value) → remove(Object o)
//Contains (search) → contains(Object o)
//Sort → Collections.sort(List<T> list)
//Clear → clear()

public class operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // Taking input from user
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();  // Read the number of elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();  // Read each element
            list.add(num);  // Store in the ArrayList
        }

        System.out.println("ArrayList elements:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");  // Access each element manually
        }


    }
}
