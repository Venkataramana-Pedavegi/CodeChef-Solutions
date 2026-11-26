import java.io.*;
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);
            if (!groups.containsKey(sortedS)) {
                groups.put(sortedS, new ArrayList<>());
            }
            groups.get(sortedS).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}

public class Main {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String nStr = sc.next();
        if (nStr == null) return;
        int N = Integer.parseInt(nStr);
        
        String[] strs = new String[N];
        for (int i = 0; i < N; i++) {
            strs[i] = sc.next();
        }
        
        Solution sol = new Solution();
        List<List<String>> ans = sol.groupAnagrams(strs);
        
        PrintWriter out = new PrintWriter(System.out);
        for (List<String> group : ans) {
            for (int i = 0; i < group.size(); i++) {
                out.print(group.get(i) + (i == group.size() - 1 ? "" : " "));
            }
            out.println();
        }
        out.flush();
    }
}