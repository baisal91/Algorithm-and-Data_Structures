package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {

        int[]arr = {4,1,2,1,2};

       // System.out.println(singleNumber(arr));
        System.out.println(singleNumber1(arr));
    }


    public static int singleNumber1(int[] arr){
        int xor = 0;

        for(int i=0; i< arr.length; i++){
            xor=xor^arr[i];
        }

        return xor;
    }

    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }


        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value==1){
                return key;
            }
        }
        return -1;
    }

}
