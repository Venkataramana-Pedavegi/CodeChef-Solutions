class Solution {
    public static boolean checkPangram(String s) {
        // code here
        boolean[] seen = new boolean[26];
               int count = 0;

               for (int i = 0; i < s.length(); i++) {
                   char ch = Character.toLowerCase(s.charAt(i));

                   if (ch >= 'a' && ch <= 'z' && !seen[ch - 'a']) {
                       seen[ch - 'a'] = true;
                       count++;
                   }
               }

               return count == 26;
    }
}