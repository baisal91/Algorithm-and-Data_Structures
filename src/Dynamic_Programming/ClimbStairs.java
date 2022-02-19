package Dynamic_Programming;

public class ClimbStairs {

    public static void main(String[] args) {

        System.out.println(climStairsBottomUp(10));
        System.out.println(climbStairs(10));
    }

    /** Top Down Approach */
    public static int climbStairs(int n) {

        return helper(n, new int[n+1]);

    }

    private  static int helper(int n,  int[] dp){
        if(n < 0) return 0;
        if(n == 0) return 1;

        if(dp[n] != 0){
            return dp[n];
        }

        dp[n]  = helper(n-1, dp) + helper(n-2, dp);


        return dp[n];
    }


    /** Bottom Up Approach */

    private static int climStairsBottomUp(int n){

        int[]dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }



}
