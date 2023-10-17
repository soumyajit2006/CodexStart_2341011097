/*Name:Soumyajit Kuila 
Regd.No.:2341011097
Prob. Statement Link:https://cses.fi/problemset/task/1083/
*/
import java.io.*;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            sum += Long.parseLong(st.nextToken());
        }
        
        long expectedSum = (long) n * (n + 1) / 2;
        long missingNumber = expectedSum - sum;
        
        System.out.println(missingNumber);
    }
}
