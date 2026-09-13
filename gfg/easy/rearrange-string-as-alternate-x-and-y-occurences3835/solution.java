class Solution {
    public String arrangeString(String s, int x, int y) {
        // code here
        int zeros = 0;
               int ones = 0;

               for (char ch : s.toCharArray()) {
                   if (ch == '0') {
                       zeros++;
                   } else {
                       ones++;
                   }
               }

               StringBuilder result = new StringBuilder();

               while (zeros > 0 || ones > 0) {

                   // Add x zeros
                   for (int i = 0; i < x && zeros > 0; i++) {
                       result.append('0');
                       zeros--;
                   }

                   // Add y ones
                   for (int i = 0; i < y && ones > 0; i++) {
                       result.append('1');
                       ones--;
                   }
               }

               return result.toString();
    }
}