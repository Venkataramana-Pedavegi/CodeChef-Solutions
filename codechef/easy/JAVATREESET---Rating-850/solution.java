import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.TreeSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) return;
        
        int n = Integer.parseInt(line.trim());
        Set<String> names = new TreeSet<>();
        
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            if (name != null && !name.trim().isEmpty()) {
                names.add(name.trim());
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (String name : names) {
            sb.append(name).append("\n");
        }
        
        System.out.print(sb);
    }
}