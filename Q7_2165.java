/*Name:Soumyajit Kuila 
Regd.No.:2341011097
Prob.Statement Link:https://cses.fi/problemset/task/2165
*/

import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int moves = (1 << n) - 1;  //The minimum number of moves is 2^n - 1
        System.out.println(moves);
        hanoi(n, 1, 3, 2);
    } 

    // Recursive function to solve the Tower of Hanoi problem
    public static void hanoi(int n, int source, int target, int auxiliary)
        {
        if (n == 1) {
            System.out.println(source + " " + target);
        } else {
            hanoi(n - 1, source, auxiliary, target);
            System.out.println(source + " " + target);
            hanoi(n - 1, auxiliary, target, source);
        }
    }
}
