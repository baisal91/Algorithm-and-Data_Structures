package Top_K_Elements;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KLargestNumbers {

    public static void main(String[] args) {
        List<Integer> result = KLargestNumbers.findKLargestNumbers(new int[]{3, 1, 5, 12, 2, 11}, 3);
        System.out.println("Here are the top K numbers: " + result);

        result = KLargestNumbers.findKLargestNumbers(new int[]{5, 12, 11, -1, 12}, 3);
        System.out.println("Here are the top K numbers: " + result);
    }

    private static List<Integer> findKLargestNumbers(int[] arr, int k) {
        if(k<1){
            return new ArrayList<>();
        }
        // Constractor which compares n1 vs n2 and return -1, 0 or 1 (lamda)
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

        // put first 'K' numbers in the min heap
           for(int i=0; i<k; i++){
               minHeap.add(arr[i]);
           }

        // go through the remaining numbers of the array, if the number from the array is bigger than the
        // top (smallest) number of the min-heap, remove the top number from heap and add the number from array
           for(int j=k; j<arr.length; j++){
               if(arr[j] > minHeap.peek()){
                   minHeap.poll();
                   minHeap.add(arr[j]);
               }
           }

        return new ArrayList<>(minHeap);
    }
}
