class Solution {
    public String timeToWords(int h, int m) {
        String[] words = {
                    "", "one", "two", "three", "four", "five",
                    "six", "seven", "eight", "nine", "ten",
                    "eleven", "twelve", "thirteen", "fourteen",
                    "fifteen", "sixteen", "seventeen", "eighteen",
                    "nineteen", "twenty", "twenty one", "twenty two",
                    "twenty three", "twenty four", "twenty five",
                    "twenty six", "twenty seven", "twenty eight",
                    "twenty nine", "thirty"
                };

                if (m == 0) {
                    return words[h] + " o' clock";
                }

                if (m == 15) {
                    return "quarter past " + words[h];
                }

                if (m == 30) {
                    return "half past " + words[h];
                }

                if (m < 30) {
                    return words[m] + " minutes past " + words[h];
                }

                int nextHour = (h == 12) ? 1 : h + 1;
                int remaining = 60 - m;

                if (remaining == 15) {
                    return "quarter to " + words[nextHour];
                }

                return words[remaining] + " minutes to " + words[nextHour];
        
    }
}