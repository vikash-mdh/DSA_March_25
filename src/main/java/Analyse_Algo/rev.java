package Analyse_Algo;

public class rev {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        for(int el : arr) {
            System.out.print(el + " ");
        }

        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("revrese arrays");
        for(int ele : arr){
            System.out.print(ele + " ");
        }



    }
}
