package Arrays;

import java.util.Scanner;

public class LinearSerch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("this is the target element");
        int target = sc.nextInt(); // this is the target element
        System.out.println("This is the lenght");
        int n = sc.nextInt();    // this is the array lenght
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
          arr[i] = sc.nextInt();
        }

        boolean flag = false;
       for(int  i = 0; i < n; i++) {
           if (arr[i] == target)
               flag = true;
           break;
       }
        if(flag == false)
            System.out.println("found the element");
        else
            System.out.println("not found the element");

    }
}
