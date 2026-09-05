import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int t = scanner.nextInt();
            // System.out.println("Number of test cases: " + t); // Debug line
            while (t-- > 0) {
                if(scanner.hasNextInt()) {
                    int num = scanner.nextInt();
                    if (isEven(num))
                        System.out.println("Even");
                    else
                        System.out.println("Odd");
                } else {
                    System.out.println("Expected more numbers as input");
                }
            }
        } else {
            System.out.println("Expected an integer for number of test cases");
        }
    }
    
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}