package CyclicSort;


class FindCorruptNums {

    public static int[] findNumbers(int[] nums) {
        // TODO: Write your code here

        int[] result = new int[2];
        int i = 0;

        while(i<nums.length){
            int j = nums[i]-1;
            if(nums[i] != nums[j]){
                swap(nums, i, j);
            }else{
                i++;
            }
        }

        for(int k=0; k<nums.length; k++){
            if(nums[k] != k+1){
                result[0] = nums[k];
                result[1] = k+1;
            }
        }




        return result;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = FindCorruptNums.findNumbers(new int[] { 3, 1, 2, 5, 2 });
        System.out.println(nums[0] + ", " + nums[1]);
        nums = FindCorruptNums.findNumbers(new int[] { 3, 1, 2, 3, 6, 4 });
        System.out.println(nums[0] + ", " + nums[1]);
    }
}
