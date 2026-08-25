import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int marks1 = scanner.nextInt();
        if (marks1 > 90) {
            System.out.println("A");
        } else if (marks1 > 70) {
            System.out.println("B");
        } else if (marks1 >= 40) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }

        int marks2 = scanner.nextInt();
        if (marks2 > 90) {
            System.out.println("A");
        } else if (marks2 > 70) {
            System.out.println("B");
        } else if (marks2 >= 40) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }

        int marks3 = scanner.nextInt();
        if (marks3 > 90) {
            System.out.println("A");
        } else if (marks3 > 70) {
            System.out.println("B");
        } else if (marks3 >= 40) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}
