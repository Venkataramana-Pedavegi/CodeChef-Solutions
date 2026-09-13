class Solution {
    public String amendSentence(String s) {
        StringBuilder result = new StringBuilder();

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    if (Character.isUpperCase(ch)) {
                        if (i != 0) {
                            result.append(' ');
                        }
                        result.append(Character.toLowerCase(ch));
                    } else {
                        result.append(ch);
                    }
                }

                return result.toString();
        
    }
}