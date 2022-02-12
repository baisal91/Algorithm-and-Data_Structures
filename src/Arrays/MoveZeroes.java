package Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {0,0,1,3,5};

        for(Integer num: moveZeroes(arr)){
            System.out.print(num + " ");
        }
    }

    public static int[] moveZeroes(int[] nums) {

        int count = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i]  = temp;
                count++;
            }
        }

        return nums;
    }
}
