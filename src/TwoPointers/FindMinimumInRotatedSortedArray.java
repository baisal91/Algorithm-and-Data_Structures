package TwoPointers;

public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(findMin(new int [] {3,4,5,1,2}));
        System.out.println(findMin(new int [] {4,5,6,7,0,1,2}));
        System.out.println(findMin(new int [] {11,13,15,17}));
        System.out.println(findMin(new int [] {3}));
        System.out.println(findMin(new int [] {4,5,6,7,0,1,2}));

    }

    private static int findMin(int[] nums){

        if(nums.length < 1){
            return -1;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[0] < nums[nums.length-1]){
            return nums[0];
        }

        int left = 0;
        int right = nums.length-1;

        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }else if(nums[mid] < nums[mid-1]){
                return nums[mid];
            }else if(nums[mid] > nums[0]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        return -1;

    }
}
