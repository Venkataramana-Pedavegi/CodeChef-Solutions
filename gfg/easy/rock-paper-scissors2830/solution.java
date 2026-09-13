class Solution {
    public int[] solveRPS(String a, String b, int k) {
        int n = a.length();
               int m = b.length();

               int cycle = lcm(n, m);

               int aWin = 0;
               int bWin = 0;

               for (int i = 0; i < cycle; i++) {
                   char x = a.charAt(i % n);
                   char y = b.charAt(i % m);

                   if ((x == 'R' && y == 'S') ||
                       (x == 'S' && y == 'P') ||
                       (x == 'P' && y == 'R')) {
                       aWin++;
                   }
                   else if ((y == 'R' && x == 'S') ||
                            (y == 'S' && x == 'P') ||
                            (y == 'P' && x == 'R')) {
                       bWin++;
                   }
               }

               int fullCycles = k / cycle;
               int remaining = k % cycle;

               int totalA = aWin * fullCycles;
               int totalB = bWin * fullCycles;

               for (int i = 0; i < remaining; i++) {
                   char x = a.charAt(i % n);
                   char y = b.charAt(i % m);

                   if ((x == 'R' && y == 'S') ||
                       (x == 'S' && y == 'P') ||
                       (x == 'P' && y == 'R')) {
                       totalA++;
                   }
                   else if ((y == 'R' && x == 'S') ||
                            (y == 'S' && x == 'P') ||
                            (y == 'P' && x == 'R')) {
                       totalB++;
                   }
               }

               return new int[]{totalA, totalB};
           }

           int gcd(int a, int b) {
               while (b != 0) {
                   int temp = a % b;
                   a = b;
                   b = temp;
               }
               return a;
           }

           int lcm(int a, int b) {
               return (a / gcd(a, b)) * b;
        
    }
}