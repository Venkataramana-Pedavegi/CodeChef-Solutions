import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()) {
            String s1 = scanner.next();
            char c1 = scanner.next().charAt(0);
            int k = scanner.nextInt();
            
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == c1) {
                    count++;
                    if (count == k) {
                        System.out.println(i);
                        scanner.close();
                        return;
                    }
                }
            }
            
            System.out.println(-1);
            scanner.close();
        }
    }
}