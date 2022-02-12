package SlidingWindow;

import java.util.HashMap;

public class MaxSumSubArrayOfSizeK {

    public static void main(String[] args) {


        int[] arr = {2, 3, 4, 1, 5};

        System.out.println(findMaxSumSubArrayOptimal(2, arr));  //7

    }

    public static int findMaxSumSubArray(int k, int[] arr) {
        // TODO: Write your code here
        int max = 0;
        int curMax = 0;

        for(int i=0; i<arr.length-k; i++){
            for(int j=i; j<i+k; j++){
                curMax+=arr[j];
                max = Math.max(max, curMax);

            }
            curMax = 0;
        }



        return max;
    }




    public static int findMaxSumSubArrayOptimal(int k, int[] arr) {
        int max=0;
        int curMax =0;
        int slideByOne = 0;

        for(int i=0; i<arr.length; i++){
            curMax+=arr[i];
            if(i>=k-1){
                max = Math.max(curMax, max);
                curMax-=arr[slideByOne];
                slideByOne++;
            }
        }
        return max;
    }
}
