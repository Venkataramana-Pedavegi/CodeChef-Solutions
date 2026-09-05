import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        int result = calculatePower(base, exponent);
        System.out.println(result);    
    }
    
    public static int calculatePower(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }
}