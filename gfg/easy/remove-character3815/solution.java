class Solution {
    public String removeChars(String s1, String s2) {
        // code here
        boolean[] remove = new boolean[26];

               for (int i = 0; i < s2.length(); i++) {
                   remove[s2.charAt(i) - 'a'] = true;
               }

               StringBuilder ans = new StringBuilder();

               for (int i = 0; i < s1.length(); i++) {
                   char ch = s1.charAt(i);

                   if (!remove[ch - 'a']) {
                       ans.append(ch);
                   }
               }

               return ans.toString();
    }
}