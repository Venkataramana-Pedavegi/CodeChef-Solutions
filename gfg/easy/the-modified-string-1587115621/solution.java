class Solution {
    public int modified(String s) {
        int ans = 0;
                HashMap<Character, Integer> map = new HashMap<>();

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                        map.put(ch, map.getOrDefault(ch, 1) + 1);
                    } else {
                        map.put(ch, 1);
                    }

                    if (map.get(ch) == 3) {
                        ans++;
                        map.put(ch, 1);
                    }
                }

                return ans;
        
    }
}