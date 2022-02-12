package Arrays;

public class SearchInsert {

   public static void main(String[] args){
       int[] arr = {1,2,3,4,5};
       int[] arr1 = {1,2,4,5};

       System.out.println(searchInsert(arr1, 0));
   }

    public static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right = mid-1;
            }

        }

        return left;
    }
}
