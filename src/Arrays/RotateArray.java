package Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

       int [] ar = rotateToRight1(arr, 5);
        for(int i: ar){
            System.out.print(i + " ");
        }
        System.out.println();

        int [] ar1 = rotateToRight(arr, 2);
        for(int i: ar1){
            System.out.print(i + " ");
        }

       System.out.println();
        System.out.println();

        int [] ar2 = rotateLeft(arr, 2);
        for(int i: ar2){
            System.out.print(i + " ");
        }
    }

    private static int[] rotateLeft(int[] arr, int k){

        for(int i=0; i<k; i++){
            int first_to_temp = arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = first_to_temp;
        }
        return arr;
    }

    private static int[] rotateToRight(int[] arr, int k){

        int [] result  = new int[arr.length];

        if(arr.length < 1){
            throw new IllegalArgumentException();
        }

        for(int i=0; i<arr.length; i++){
            result[(i+k )%arr.length] = arr[i];
        }

        return result;
    }

    private static int[] rotateToRight1(int[] arr, int k){

        for(int i=0; i<k; i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        return arr;
    }

}
