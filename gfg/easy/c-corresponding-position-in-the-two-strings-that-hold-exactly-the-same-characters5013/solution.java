class Solution {
    public boolean sameSeq(String s1, String s2) {
      int i = 0, j = 0;

              while (i < s1.length() && j < s2.length()) {
                  if (s1.charAt(i) != s2.charAt(j)) {
                      return false;
                  }

                  char ch = s1.charAt(i);

                  while (i < s1.length() && s1.charAt(i) == ch) {
                      i++;
                  }

                  while (j < s2.length() && s2.charAt(j) == ch) {
                      j++;
                  }
              }

              return i == s1.length() && j == s2.length();
          
    }
}