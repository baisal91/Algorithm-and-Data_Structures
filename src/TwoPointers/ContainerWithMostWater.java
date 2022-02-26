package TwoPointers;

//Return the maximum amount of water a container can store.
public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(arr.length-1);
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;
        int count = height.length-1;
        int max = Integer.MIN_VALUE;

        while(left<right){

            int min = Math.min(height[left], height[right]);
            max = Math.max(max, min*count);

            if(height[left] < height[right]){
                left++;
                count--;
            }else{
                right--;
                count--;
            }
        }

        return max;

    }
}
