class Solution {
    public String toggleCase(String s) {
        // code here
        StringBuilder result = new StringBuilder();

                for (char ch : s.toCharArray()) {
                    if (Character.isLowerCase(ch)) {
                        result.append(Character.toUpperCase(ch));
                    } else {
                        result.append(Character.toLowerCase(ch));
                    }
                }

                return result.toString();
    }
}
