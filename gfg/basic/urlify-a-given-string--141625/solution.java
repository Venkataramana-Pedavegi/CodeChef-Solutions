class Solution {
    static String URLify(String s) {
        // code here
       StringBuilder ans = new StringBuilder();

              for (int i = 0; i < s.length(); i++) {
                  char ch = s.charAt(i);

                  if (ch == ' ') {
                      ans.append("%20");
                  } else {
                      ans.append(ch);
                  }
              }

              return ans.toString(); 
    }
}