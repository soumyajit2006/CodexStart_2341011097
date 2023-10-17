/*Name:Soumyajit Kuila 
Regd.No.:2341011097
Prob. Statement Link:https://cses.fi/problemset/task/1755/
*/

import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        List<Character> oddCountChars = new ArrayList<>();
        StringBuilder halfPalindrome = new StringBuilder();
        
        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            
            if (count % 2 == 1) {
                if (oddCountChars.size() > 1) {
                    System.out.println("NO SOLUTION");
                    return;
                }
                oddCountChars.add(c);
            }
            
            for (int i = 0; i < count / 2; i++) {
                halfPalindrome.append(c);
            }
        }
        
        if (oddCountChars.size() > 1) {
            System.out.println("NO SOLUTION");
        } else {
            StringBuilder palindrome = new StringBuilder(halfPalindrome);
            
            if (oddCountChars.size() == 1) {
                palindrome.append(oddCountChars.get(0));
            }
            
            palindrome.append(halfPalindrome.reverse());
            
            System.out.println(palindrome);
        }
    }
}

