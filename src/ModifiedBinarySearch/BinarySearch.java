package ModifiedBinarySearch;

public class BinarySearch {
    public static int search(int[] arr, int key) {
        // TODO: Write your code here
        int start = 0;
        int end = arr.length-1;

        boolean isAcending = arr[0] < arr[end];
        if(isAcending){
            for(int i =0; i< arr.length; i++){
                int middle = start + (end-start)/2;
                if(arr[middle] == key){
                    return middle;
                }else if(key < arr[middle]){
                    end = middle-1;
                }else{
                    start = middle+1;
                }

            }

        }else{
            for(int i =0; i< arr.length; i++){
                int middle = start + (end-start)/2;
                if(arr[middle] == key){
                    return middle;
                }else if(key > arr[middle]){
                    end = middle-1;
                }else{
                    start = middle+1;
                }

            }
        }



        return -1;
    }

    public static void main(String[] args) {
         System.out.println(BinarySearch.search(new int[] { 4, 6, 10 }, 10));
        System.out.println(BinarySearch.search(new int[]{1, 2, 3, 4, 5, 6, 7}, 5));
         System.out.println(BinarySearch.search(new int[] { 10, 6, 4 }, 10));
        System.out.println(BinarySearch.search(new int[]{10, 6, 4}, 4));
    }
}
