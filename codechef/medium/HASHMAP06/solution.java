import java.io.*;
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            
            // Count frequencies of each word
            Map<String, Integer> freqMap = new HashMap<>();
            for (int i = 0; i < N; i++) {
                String word = sc.next();
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
            
            // Find the highest and second highest frequencies
            int firstMax = -1;
            int secondMax = -1;
            
            for (int count : freqMap.values()) {
                if (count > firstMax) {
                    secondMax = firstMax;
                    firstMax = count;
                } else if (count > secondMax && count < firstMax) {
                    secondMax = count;
                }
            }
            
            // If there's no second highest frequency, print -1
            if (secondMax == -1) {
                System.out.println("-1");
                continue;
            }
            
            // Find and print the word corresponding to secondMax
            for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue() == secondMax) {
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }
        
        sc.close();
    }
}