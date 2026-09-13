class Solution {
    static boolean check_duck(String num) {
        int i = 0;

               while (i < num.length() && num.charAt(i) == '0') {
                   i++;
               }

               while (i < num.length()) {
                   if (num.charAt(i) == '0') {
                       return true;
                   }
                   i++;
               }

               return false;
        
    }
}