class Solution {
    public boolean isStringExist(String s, String[] arr) {
        // code here
        for (String str : arr) {

                   if (str.length() != s.length()) {
                       continue;
                   }

                   int count = 0;

                   for (int i = 0; i < s.length(); i++) {
                       if (s.charAt(i) != str.charAt(i)) {
                           count++;
                       }
                   }

                   if (count == 1) {
                       return true;
                   }
               }

               return false;
    }
}