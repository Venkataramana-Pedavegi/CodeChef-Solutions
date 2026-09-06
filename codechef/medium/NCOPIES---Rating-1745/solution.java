import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            String[] nm = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(nm[0]);
            long m = Long.parseLong(nm[1]);
            String s = br.readLine().trim();
            
            long tot = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    tot++;
                }
            }
            
            long target = tot * m;
            
            // If the total sum is odd, we can't divide it into two equal parts
            if (target % 2 != 0) {
                out.append(0).append("\n");
                continue;
            }
            
            // If the string contains only '0's
            if (target == 0) {
                out.append(n * m).append("\n");
                continue;
            }
            
            target /= 2;
            long cur = 0;
            long copies = m;
            
            // Skip full copies of A until cur + tot < target
            while (copies > 0) {
                if (cur + tot < target) {
                    copies--;
                    cur += tot;
                } else {
                    break;
                }
            }
            
            long ans = 0;
            // We only need to check at most 2 copies of A starting from the current state
            int limit = (int) Math.min(copies, 2);
            for (int j = 0; j < limit; j++) {
                for (int i = 0; i < n; i++) {
                    if (cur == target) {
                        ans++;
                    }
                    if (s.charAt(i) == '1') {
                        cur++;
                    }
                }
            }
            
            out.append(ans).append("\n");
        }
        
        System.out.print(out);

	}
}
