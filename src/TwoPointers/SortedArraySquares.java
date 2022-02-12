package TwoPointers;

public class SortedArraySquares {


    public static void main(String[] args) {

        int[] result = SortedArraySquares.makeSquares(new int[] { -2, -1, 0, 2, 3 });
        for (int num : result)
            System.out.print(num + " ");
        System.out.println();

        result = SortedArraySquares.makeSquares1(new int[] { -2, -1, 0, 2, 3 });
        for (int num : result)
            System.out.print(num + " ");
        System.out.println();
    }

    public static int[] makeSquares1(int[] arr) {
        int[] squares = new int[arr.length];
        // TODO: Write your code here
        int low = 0;
        int high = arr.length-1;
        for(int i=arr.length-1; i>=0; i--){
            int left = arr[low] * arr[low];
            int right = arr[high] * arr[high];
            if(left<right){
                squares[i] = right;
                high--;
            }else{
                squares[i] = left;
                low++;
            }

        }

        return squares;
    }

    public static int[] makeSquares(int[] arr) {
        int size = arr.length;
        int[] squares = new int[size];

        int highestSquareIdx = size - 1;

        int left = 0, right = size-1;

        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                squares[highestSquareIdx--] = leftSquare;
                left++;
            } else {
                squares[highestSquareIdx--] = rightSquare;
                right--;
            }
        }
        return squares;
    }
}
