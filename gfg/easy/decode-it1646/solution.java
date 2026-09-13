class Solution {
    public char decodeIt(String s, long k) {
        // code here
        long len = 0;

               for (char ch : s.toCharArray()) {
                   if (Character.isLetter(ch)) {
                       len++;
                   } else {
                       len *= (ch - '0');
                   }
               }

               for (int i = s.length() - 1; i >= 0; i--) {
                   char ch = s.charAt(i);

                   if (Character.isDigit(ch)) {
                       int d = ch - '0';

                       len /= d;
                       k = (k - 1) % len + 1;
                   } else {
                       if (k == len) {
                           return ch;
                       }

                       len--;
                   }
               }

               return '\0';
    }
};