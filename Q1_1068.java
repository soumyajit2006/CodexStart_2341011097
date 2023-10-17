/*Name:Soumyajit Kuila 
Regd.No.:2341011097
Prob. Statement Link:https://cses.fi/problemset/task/1068/
*/

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        
        System.out.print(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(" " + n);
        }
    }
}

