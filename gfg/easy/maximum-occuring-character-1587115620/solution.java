class Solution {
    public static char getMaxOccuringChar(String s) {
        int[] freq = new int[26];

                for (char ch : s.toCharArray()) {
                    freq[ch - 'a']++;
                }

                int maxFreq = 0;
                char answer = 'a';

                for (int i = 0; i < 26; i++) {
                    if (freq[i] > maxFreq) {
                        maxFreq = freq[i];
                        answer = (char) ('a' + i);
                    }
                }

                return answer;
        
    }
}