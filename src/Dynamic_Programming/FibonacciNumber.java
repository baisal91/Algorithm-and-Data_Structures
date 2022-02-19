package Dynamic_Programming;

import java.util.ArrayList;

public class FibonacciNumber {


    private static long[] dp;

    public static void main(String[] args) {


        int n = 10;
        dp = new long[n+1];

        //System.out.println(fibonacci(9999));

        //To print out nth fibonacci number
        System.out.println(fibonacciDP(n));
        // To print out all the fibonacci numbers up to n
        for(int k = 0; k<=n; k++){
            System.out.print(fibonacciDP(k) + " ");
        }

    }

    /**
     * Dynamic Programing method
     * @param n
     * @return
     */
    private static long fibonacciDP(int n){
        if(n<=1){
            return n;
        }


        if(dp[n] != 0){
            return dp[n];
        }

        long res = fibonacciDP(n-1) + fibonacciDP(n-2);
        dp[n] = res;

        return res;
    }

    /**
     * Regular recursion fibo method
     * @param n
     * @return
     */
    private static int fibonacci(int n){
        if(n<=2){
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
