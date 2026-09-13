class Solution {
    public boolean halvesMatch(String s) {
        int n = s.length();
                int mid = n / 2;

                int[] freq1 = new int[26];
                int[] freq2 = new int[26];

                // First half
                for (int i = 0; i < mid; i++) {
                    freq1[s.charAt(i) - 'a']++;
                }

                // Second half
                int start = (n % 2 == 0) ? mid : mid + 1;

                for (int i = start; i < n; i++) {
                    freq2[s.charAt(i) - 'a']++;
                }

                // Compare frequencies
                for (int i = 0; i < 26; i++) {
                    if (freq1[i] != freq2[i]) {
                        return false;
                    }
                }

                return true;

        
    }
}