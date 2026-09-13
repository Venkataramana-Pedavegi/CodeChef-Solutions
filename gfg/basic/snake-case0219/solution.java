class Solution {
    public String snakeCase(String s) {
        // code here
        StringBuilder ans = new StringBuilder();

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    if (ch == ' ') {
                        ans.append('_');
                    } else {
                        ans.append(Character.toLowerCase(ch));
                    }
                }

                return ans.toString();
    }
}