import java.io.*;
import java.util.*;

public class Main {

    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer[] integers = new Integer[n];

        for (int i = 0; i < n; i++) {
            integers[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine().trim());

        st = new StringTokenizer(br.readLine());

        Double[] doubles = new Double[m];

        for (int i = 0; i < m; i++) {
            doubles[i] = Double.parseDouble(st.nextToken());
        }

        System.out.println(findMax(integers));
        System.out.println(findMax(doubles));
    }
}