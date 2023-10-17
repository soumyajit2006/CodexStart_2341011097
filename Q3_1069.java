
/*Name:Soumyajit Kuila 
Regd.No.:2341011097
Prob. Statement Link:https://cses.fi/problemset/task/1069/
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new     InputStreamReader(System.in));
        String dnaSequence = br.readLine();
        
        int maxLength = 0;
        int currentLength = 1;
        
        for (int i = 1; i < dnaSequence.length(); i++) {
            if (dnaSequence.charAt(i) == dnaSequence.charAt(i - 1)) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        maxLength = Math.max(maxLength, currentLength);
        
        System.out.println(maxLength);
    }
}
