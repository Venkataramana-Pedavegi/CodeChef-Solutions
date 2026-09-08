class Solution {
    public int secFrequent(String[] arr) {
        if (arr == null || arr.length == 0) {
                    return -1;
                }

                HashMap<String, Integer> freq = new HashMap<>();
                for (String str : arr) {
                    freq.put(str, freq.getOrDefault(str, 0) + 1);
                }
                if (freq.size() < 2) {
                    return -1;
                }

                int highest = 0;
                int secondHighest = 0;
                for (int count : freq.values()) {

                    if (count > highest) {
                        secondHighest = highest;
                        highest = count;
                    } 
                    else if (count > secondHighest && count < highest) {
                        secondHighest = count;
                    }
                }
                if (secondHighest == 0) {
                    return -1;
                }

                return secondHighest;
            
        
    }
}