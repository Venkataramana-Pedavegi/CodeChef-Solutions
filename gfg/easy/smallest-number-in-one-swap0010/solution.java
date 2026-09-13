class Solution {
    public String smallestNumber(String s) {
        // code here
        char[] arr = s.toCharArray();
               int n = arr.length;

               // Store the last position of each digit
               int[] last = new int[10];

               for (int i = 0; i < n; i++) {
                   last[arr[i] - '0'] = i;
               }

               for (int i = 0; i < n; i++) {
                   int current = arr[i] - '0';

                   // Try smaller digits from 0 to current-1
                   for (int d = 0; d < current; d++) {
                       if (last[d] > i) {

                           // Don't create a leading zero
                           if (i == 0 && d == 0) {
                               continue;
                           }

                           int j = last[d];

                           char temp = arr[i];
                           arr[i] = arr[j];
                           arr[j] = temp;

                           return new String(arr);
                       }
                   }
               }

               return s;
               
    }
}