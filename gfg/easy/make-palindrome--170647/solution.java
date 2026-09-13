class Solution {
    public static boolean makePalindrome(String[] arr) {
        // code here
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int middle = 0;

        for (String str : map.keySet()) {
            String rev = new StringBuilder(str).reverse().toString();

            if (str.equals(rev)) {
                if (map.get(str) % 2 != 0) {
                    middle++;
                }
            } else {
                if (!map.containsKey(rev) ||
                    !map.get(str).equals(map.get(rev))) {
                    return false;
                }
            }
        }

        return middle <= 1;

    }
}
