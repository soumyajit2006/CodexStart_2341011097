/*Name:Soumyajit Kuila 
Regd.No.:2341011097
Prob. Statement Link:https://cses.fi/problemset/task/1618
*/

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int trailingZeros = 0;
        while (n > 0) {
            n /= 5; // Count the number of multiples of 5 in n
            trailingZeros += n;
        }

        System.out.println(trailingZeros);
    }
}
