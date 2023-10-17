/*Name:Soumyajit Kuila 
Regd.No.:2341011097
Prob. Statement Link:https://cses.fi/problemset/task/1072
*/

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int k = 1; k <= n; k++) {
            long ways = calculateWays(k);
            System.out.println(ways);
        }
    }

    public static long calculateWays(int k) {
        if (k == 1) {
            return 0;
        }

        long totalPositions = k * k * 1L;
        long attackingPositions = 4 * (k - 1) * (k - 2);

        return (totalPositions * (totalPositions - 1) / 2) - attackingPositions;
    }
}
