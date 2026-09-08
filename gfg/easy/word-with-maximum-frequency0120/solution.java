class Solution {
    public String maximumFrequency(String s) {

                String[] words = s.split(" ");

                HashMap<String, Integer> freq = new HashMap<>();

                for (String word : words) {
                    freq.put(word, freq.getOrDefault(word, 0) + 1);
                }

                String answer = words[0];
                int maxFreq = freq.get(answer);
                for (String word : words) {
                    int currentFreq = freq.get(word);

                    if (currentFreq > maxFreq) {
                        maxFreq = currentFreq;
                        answer = word;
                    }
                }

                return answer + " " + maxFreq;
    }
}