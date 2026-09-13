class Solution {
    public String reducedString(String s) {
        // code here
        StringBuilder stack = new StringBuilder();

                for (char ch : s.toCharArray()) {
                    stack.append(ch);

                    int n = stack.length();

                    if (n >= 3 &&
                        stack.charAt(n - 1) == stack.charAt(n - 2) &&
                        stack.charAt(n - 2) == stack.charAt(n - 3)) {

                        stack.delete(n - 3, n);
                    }
                }

                return stack.length() == 0 ? "-1" : stack.toString();
    }
}