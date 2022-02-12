package CyclicSort;

class FindDuplicate {

    public static int findNumber(int[] nums) {
        // TODO: Write your code here

        int i=0;
        while(i<nums.length){
            int j = nums[i]- 1;
            if(nums[i] != nums[j]){
                swap(nums, i, j);
            }else{
                i++;
            }
        }

        for(int k = 0; k<nums.length-1; k++){
            if(nums[k] == nums[k+1]){
                return nums[k];
            }
        }



        return -1;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
       // System.out.println(FindDuplicate.findNumber(new int[] { 1, 4, 4, 3, 2 }));
        System.out.println(FindDuplicate.findNumber(new int[] { 2, 1, 3, 3, 5, 4 }));
      //  System.out.println(FindDuplicate.findNumber(new int[] { 2, 4, 1, 4, 4 }));
    }
}

