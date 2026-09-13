class Solution {
    public ArrayList<Integer> printPalindromes(int m, int n) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

                for (int i = m; i <= n; i++) {
                    int num = i;
                    int rev = 0;

                    while (num > 0) {
                        rev = rev * 10 + num % 10;
                        num /= 10;
                    }

                    if (i == rev) {
                        result.add(i);
                    }
                }

                return result;
    }
}