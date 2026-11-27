import java.util.*;

public class Main {
    public static void frequencyBasedSort(int n, List<Integer> arr) {
        // Initialize a count array to count frequencies (since max value is 100)
        final int max_value = 100;
        int[] count = new int[max_value + 1];
        // Count frequencies of each integer
        for (int num : arr) {
            count[num]++;
        }
        // Create a list of pairs (value, frequency)
        List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>();
        for (int i = 0; i <= max_value; ++i) {
            if (count[i] > 0) {
                freqList.add(new AbstractMap.SimpleEntry<>(i, count[i]));
            }
        }
        // Sort the list by frequency (ascending) and by value (ascending if frequencies are the same)
        freqList.sort((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return Integer.compare(a.getKey(), b.getKey()); // Sort by value if frequencies are the same
            }
            return Integer.compare(a.getValue(), b.getValue()); // Otherwise, sort by frequency
        });
        // Output the sorted list based on frequency
        for (Map.Entry<Integer, Integer> p : freqList) {
            for (int i = 0; i < p.getValue(); ++i) {
                System.out.print(p.getKey() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            arr.add(scanner.nextInt());
        }
        // Function call to perform frequency-based sorting
        frequencyBasedSort(n, arr);
    }
}
