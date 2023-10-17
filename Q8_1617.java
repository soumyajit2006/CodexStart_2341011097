/*Name:Soumyajit Kuila 
Regd.No.:2341011097
Prob. Statement Link:https://cses.fi/problemset/task/1617
*/

import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int mod = 1000000007;
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 2;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] * 2) % mod;
        }
        
        System.out.println(dp[n]);
    }
}
