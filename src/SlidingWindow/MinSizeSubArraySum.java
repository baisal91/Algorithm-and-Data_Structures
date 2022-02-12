package SlidingWindow;

import java.util.HashMap;

public class MinSizeSubArraySum {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 1, 8}; //S = 7  output 2

      //  System.out.println(findMinSubArray(8, arr));


        HashMap<Character, Integer> map = new HashMap<>();

        map.put('A',1);
        map.put('B', 1);
        map.put('A',1);

        System.out.println(map.size());

    }

    public static int findMinSubArray(int S, int[] arr) {
        int curSum = 0;
        int minCount = Integer.MAX_VALUE;
        int slideByOne = 0;
        int count = 0;

        for(int i=0; i<arr.length; i++){

            curSum+=arr[i];
            count++;

            while(curSum>=S){

                minCount= Math.min(count, minCount);
                curSum-=arr[slideByOne];
                slideByOne++;
               count--;
            }
        }




        return minCount;
    }
}
