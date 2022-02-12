package Arrays;

public class MaxSubArray {

    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4}; //6
        int[] arr1 = {1,2,4,5};

        System.out.println(bruteForceMaxSubArray(arr));
    }



    public static int bruteForceMaxSubArray(int[] nums) {

        int max = nums[0];
        int curMax = max;

        for (int i=0; i<nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                curMax+=nums[j];
                if(curMax>max){
                    max=curMax;
                }
            }
            curMax=0;

        }

        return max;

    }
}
