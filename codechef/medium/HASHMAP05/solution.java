import java.util.*;
class Main {
    
    public static List<List<Integer>> findTopK(int[] arr, int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            
            List<Map.Entry<Integer, Integer>> temp = new ArrayList<>(freq.entrySet());
            
            // Sort by frequency (descending) and then by value (ascending when frequencies are equal)
            Collections.sort(temp, (a, b) -> {
                if (a.getValue() != b.getValue()) {
                    return b.getValue() - a.getValue(); // Descending by frequency
                } else {
                    return a.getKey() - b.getKey(); // Ascending by value
                }
            });
            
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j < Math.min(k, temp.size()); j++) {
                current.add(temp.get(j).getKey());
            }
            
            result.add(current);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        List<List<Integer>> result = findTopK(arr, n, k);
        
        for (List<Integer> list : result) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}