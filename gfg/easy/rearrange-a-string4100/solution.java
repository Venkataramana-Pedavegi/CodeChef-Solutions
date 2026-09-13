class Solution {
    public String arrangeString(String s) {
        int[] freq = new int[26];
                int sum = 0;

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    if (ch >= 'A' && ch <= 'Z') {
                        freq[ch - 'A']++;
                    } else {
                        sum += ch - '0';
                    }
                }

                StringBuilder ans = new StringBuilder();

                for (int i = 0; i < 26; i++) {
                    while (freq[i] > 0) {
                        ans.append((char) ('A' + i));
                        freq[i]--;
                    }
                }

                if (sum > 0) {
                    ans.append(sum);
                }

                return ans.toString();
            
    }
}
