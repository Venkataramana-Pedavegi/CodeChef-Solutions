class Solution {
    public boolean checkBinary(String s) {
        // code here
        boolean seenOne = false;
                boolean seenZero = false;

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    if (ch == '1') {
                        if (seenOne && seenZero) {
                            return false;
                        }
                        seenOne = true;
                    } else {
                        if (seenOne) {
                            seenZero = true;
                        }
                    }
                }

                return true;
    }
}