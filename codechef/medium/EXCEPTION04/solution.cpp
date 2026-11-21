
        Scanner scanner = new Scanner(System.in);

        int totalBill = scanner.nextInt();
        int members = scanner.nextInt();

        try {
            int share = totalBill / members;

            System.out.println("Each member pays: " + share);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide expense among zero members");
        }

        scanner.close();
    }
}
    public static void main(String[] args) {

public class Codechef {

import java.util.Scanner;