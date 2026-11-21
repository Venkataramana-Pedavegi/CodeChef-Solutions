import java.util.ArrayList;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.set(i, numbers.get(i) + 1);
            }
        }
        
        System.out.println("Updated Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers.get(i));
        }
        sc.close();
    }
}
