import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.next();
        
        char searchChar = scanner.next().charAt(0);
        
        int position = -1;
        
        for (int i = 0; i < inputString.length(); ++i) {
            if (inputString.charAt(i) == searchChar) {
                position = i;
                break; // 
            }
        }
        
        System.out.println(position);
    }
}