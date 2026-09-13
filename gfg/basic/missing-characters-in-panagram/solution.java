class Solution {
    public static String missingPanagram(String s) {
        // code here
        boolean[] seen = new boolean[26];

               for (char ch : s.toCharArray()) {
                   if (ch >= 'A' && ch <= 'Z') {
                       ch = Character.toLowerCase(ch);
                   }

                   seen[ch - 'a'] = true;
               }

               StringBuilder ans = new StringBuilder();

               for (int i = 0; i < 26; i++) {
                   if (!seen[i]) {
                       ans.append((char) ('a' + i));
                   }
               }

               if (ans.length() == 0) {
                   return "-1";
               }

               return ans.toString();
    }
}
