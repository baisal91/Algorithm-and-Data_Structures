package BitwiseXOR;


//XOR every element in the array at the end every pair will disappear and one with no pair will stay
public class SingleNumber {
    public static int findSingleNumber(int[] arr) {
        // TODO: Write your code here

        int s1 = arr[0];

        for(int i=1; i<arr.length; i++){
            s1=s1^arr[i];
        }

        return s1;
    }

    public static void main( String args[] ) {
        System.out.println(findSingleNumber(new int[]{1, 4, 2, 1, 3, 2, 3}));
    }
}
