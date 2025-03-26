package codeStudio;

public class findthemaximum {
//
//    public Pair<Integer, Integer> getMinMax(int[] arr) {
//        int largest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//
//        for (int i = 0; i<arr.length; i++){
//            if (largest<arr[i]){
//                largest = arr[i];
//            }
//            if (smallest>arr[i]){
//                smallest = arr[i];
//            }
//        }
//        return new Pair<>(smallest, largest);
//
//
//
//    }

    public static int sumOfMaxMin(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i<arr.length; i++){
            if (largest<arr[i]){
                largest = arr[i];
            }
            if (smallest>arr[i]){
                smallest = arr[i];
            }
        }
        return smallest + largest;


    }


}
