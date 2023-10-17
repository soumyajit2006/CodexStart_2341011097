/*Name:Soumyajit Kuila 
Regd.No.:2341011097
Prob. Statement Link:https://cses.fi/problemset/task/1070/
*/

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        } else {
            StringBuilder evenNumbers = new StringBuilder();
            StringBuilder oddNumbers = new StringBuilder();

            for (int i = 2; i <= n; i += 2) {
                evenNumbers.append(i).append(" ");
            }
            for (int i = 1; i <= n; i += 2) {
                oddNumbers.append(i).append(" ");
            }

            System.out.print(evenNumbers.toString() + oddNumbers.toString());
        }
    }
}

