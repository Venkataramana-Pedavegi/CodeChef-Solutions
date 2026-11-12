import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        
        String s = sc.next();
        String t = sc.next();
        
        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }
        
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        
        for (int count : freq) {
            if (count != 0) {
                System.out.println(false);
                return;
            }
        }
        
        System.out.println(true);
    }
}