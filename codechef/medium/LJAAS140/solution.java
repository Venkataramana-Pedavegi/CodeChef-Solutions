import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int area = calculateArea(length, width);
        System.out.println(area);    
    }
    
    public static int calculateArea(int length, int width) {
        return length * width;
    }
}