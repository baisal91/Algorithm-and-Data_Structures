package CyclicSort;

public class FirstSmallestMissingPositive {
    public static int findNumber(int[] nums) {
        // TODO: Write your code here

        int i=0;

        while(i<nums.length){

                if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]){
                    swap(nums, i, nums[i]-1);
                }else{
                    i++;
                }

        }

        for(int k: nums){
            System.out.print(k + " ");
            k++;
        }


        return -1;
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        System.out.println(FirstSmallestMissingPositive.findNumber(new int[] { -3, 1, 5, 4, 2 }));
        System.out.println(FirstSmallestMissingPositive.findNumber(new int[] { 3, -2, 0, 1, 2 }));
        System.out.println(FirstSmallestMissingPositive.findNumber(new int[] { 3, 2, 5, 1 }));
    }
}
