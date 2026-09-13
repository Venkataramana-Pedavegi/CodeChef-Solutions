class Solution {
    public String boomNumber(int k) {
        // code here
        StringBuilder result = new StringBuilder();

                k = k + 1;

                while (k > 1) {
                    if (k % 2 == 0) {
                        result.append('2');
                    } else {
                        result.append('3');
                    }

                    k = k / 2;
                }

                return result.reverse().toString();
    }
}