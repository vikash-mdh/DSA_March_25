package two_D_arrays;

public class squareOftheMatrix {
    public static  void print(int arr[][]){

        int n = arr.length;
        int m = arr[0].length;
        for(int i  = 0 ; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int arr[][] =  {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        print(arr);
        int n = arr.length;
//        int m = arr[0].length;

//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < i; j++){
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//
//            }
//
//        }
//        System.out.println(" this is the my square arrays");
//        print(arr);



        for(int i = 0;  i < n; i++){
            if(i % 2 == 1){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] +" ");
             }
            }else{
                for(int j  = n - 1; j >= 0; j--){
                    System.out.print(arr[i][j] +" ");
                }
            }

        }
        System.out.println();

    }
}
