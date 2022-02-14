package Top_K_Elements;

import java.util.PriorityQueue;

public class MaxHeap {

    public static void main(String[] args) {
        int result = findKLargestNumbers(new int[]{3, 1, 5, 12, -3, 2, 11,80});
        System.out.println("Here are the top K numbers: " + result);

        result = findKLargestNumbers(new int[]{5, 12, 11, -1, 12,90});
        System.out.println("Here are the top K numbers: " + result);
    }

    private static int findKLargestNumbers(int[] arr) {

        // Constractor which compares n1 vs n2 and return -1, 0 or 1 (lamda)
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((n1, n2) -> n2 - n1);

        // put first 'K' numbers in the min heap
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
        }


        return minHeap.peek();
    }
}
