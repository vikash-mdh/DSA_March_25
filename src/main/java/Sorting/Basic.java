package Sorting;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
     int arr[] = {2,4,6,1,2,4,1};
     Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        char ch[] = {'D', 'A', 'P', 'C', 'B'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));


        int arr1[] = {5,30,20,10,8};
        Arrays.sort(arr1,1, 4);
        System.out.println(Arrays.toString(arr1));
    }
}
