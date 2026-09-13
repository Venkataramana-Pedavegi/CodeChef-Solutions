class Solution {
    static int repeatedCharacter(String S) {
        // code here
        int[] freq = new int[256];

                for (int i = 0; i < S.length(); i++) {
                    freq[S.charAt(i)]++;
                }

                for (int i = 0; i < S.length(); i++) {
                    if (freq[S.charAt(i)] > 1) {
                        return i;
                    }
                }

                return -1;
    }
}