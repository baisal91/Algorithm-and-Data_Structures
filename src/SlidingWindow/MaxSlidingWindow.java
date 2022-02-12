package SlidingWindow;

public class MaxSlidingWindow {

    public static void main(String[] args) {
       // int[] arr = {1,3,-1,-3,5,3,6,7}; //Output: [3,3,5,5,6,7] k=3
        int[] arr = {1,-4,-3,-2,5};
        int[] output = maxSlidingWindow(arr, 3);
        for(Integer i: output){
            System.out.print(i + "\t");
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int[] output = new int [nums.length-(k-1)];

        int max = 0;
        int curMax=0;
        int slideByOne = 0;
        int j = 0;

        for(int i=0; i<nums.length; i++){
            curMax+=nums[i];
            if(max < nums[i]){
                max = nums[i];
            }

            if(i>=k-1){
                output[j] = max;
                j++;
                curMax-=nums[slideByOne];
                slideByOne++;


            }
        }



            return  output;
    }

}
