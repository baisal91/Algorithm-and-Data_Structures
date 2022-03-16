public class TestSum {

    public static void main(String[] args) {

       String s = "hello";
       String s1 = "hllh";

       System.out.println(isPalindrome(s));



    }

    // Check whether the String is Palindrome or not
    private static boolean isPalindrome(String s){

        boolean res = true;

        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }

        }


        return res;
    }
}
