import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        List<Character> consonants = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (!isVowel(c)) {
                consonants.add(c);
            }
        }

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : consonants) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        long total = factorial(consonants.size());
        for (int count : freq.values()) {
            total /= factorial(count); // adjust for duplicates
        }

        System.out.println(total);
        sc.close();
    }

    static boolean isVowel(char c) {
        return "AEIOU".indexOf(c) != -1;
    }

    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
