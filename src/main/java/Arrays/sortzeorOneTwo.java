package Arrays;

public class sortzeorOneTwo {
    public static void main(String[] args) {
        int arr[] = {1,2,0,0,1,1,2,2,0,0,0,1,2,0};
        int n = arr.length;

        int nzero = 0;
        int none = 0;
        for(int i = 0; i < n; i++){ // iterate the hole arrays
            if(arr[i] == 0) // if arr is zeor then size ++
                nzero++;
            if(arr[i] == 1) // if arr is 1 than size++
                none++;
        }
        for(int i = 0; i < n; i++){ // iterate hte
            if(i < nzero)
                arr[i] = 0;
            else if(i < nzero + none)
                arr[i] = 1;
            else
                arr[i] = 2;

        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
