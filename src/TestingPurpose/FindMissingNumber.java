package TestingPurpose;


import java.util.HashMap;

/**
 * The array is unsorted
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,6,4,7,9};

        System.out.println(missingNumber(arr));
        System.out.println(miss(arr));

    }


    private static int missingNumber(int[] arr){

        int a = arr[0];
        for(int i=1; i<arr.length; i++){
            a=a^arr[i];
        }
        int b=1;
        for(int j=2; j<=arr.length+1; j++){
            b=b^j;
        }

        b = a^b;

        return b;
    }

    private static int miss(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: arr){
            map.put(i, 1);
        }

        for(int k = 1; k<=arr.length; k++){
            if(!map.containsKey(k)){
                return k;
            }
        }
        return -1;
    }

}
