public class ClimbStairsL70 {
    static int brute_climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return brute_climbStairs(n - 1) + brute_climbStairs(n - 2);
    }

    static int better_climbstairs(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {

    }
}
