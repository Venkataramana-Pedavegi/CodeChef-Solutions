import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        char op = scanner.next().charAt(0); 

        switch(op) 
        {
            case '+': 
                System.out.println(num1 + num2); 
                break;
            case '-': 
                System.out.println(num1 - num2); 
                break;
            case '*': 
                System.out.println(num1 * num2); 
                break;
            case '/': 
                System.out.println(num1 / num2); 
                break;
            default: 
                System.out.println("Invalid operator");
        }
    }
}