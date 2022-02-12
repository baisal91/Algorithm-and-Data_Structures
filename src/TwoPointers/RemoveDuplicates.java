package TwoPointers;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4};

        int[] out = remove(arr);

        for(int i: out){
            System.out.print(i + " ");
        }

    }

    public static int[] remove(int[] arr) {
        int count=1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                arr[count]  = arr[i+1];
                count++;
            }
        }
        return arr;
    }
}
