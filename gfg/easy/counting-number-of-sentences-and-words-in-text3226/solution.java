class Solution {
    public ArrayList<Integer> sentenceWord(String s) {
        // code here
        int words = 0;
                int sentences = 0;

                boolean inWord = false;
                boolean hasContent = false;

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    // Count words
                    if ((ch >= 'a' && ch <= 'z') ||
                        (ch >= 'A' && ch <= 'Z')) {

                        if (!inWord) {
                            words++;
                            inWord = true;
                        }

                        hasContent = true;
                    } else {
                        inWord = false;
                    }

                    // Count sentences
                    if (ch == '.' || ch == '!' || ch == '?') {
                        if (hasContent) {
                            sentences++;
                            hasContent = false;
                        }
                    }
                }

                // Last sentence without punctuation
                if (hasContent) {
                    sentences++;
                }

                ArrayList<Integer> result = new ArrayList<>();
                result.add(sentences);
                result.add(words);

                return result;
    }
}