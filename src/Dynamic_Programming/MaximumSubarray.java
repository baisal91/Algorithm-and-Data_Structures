package Dynamic_Programming;

public class MaximumSubarray {


    public static void main(String[] args) {
        System.out.println(maxSubArray(new int [] {-2,1,-3,4,-1,2,1,-5,4}));
    }


    public static int maxSubArray(int[] nums) {

        int max = nums[0];
        int currMax = max;

        for(int i=1; i<nums.length; i++){
            currMax = Math.max(nums[i], currMax + nums[i]);
            max = Math.max(max, currMax);
        }

        return max;
    }
}

