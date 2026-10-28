import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt(); // input first number
        if(num > 0){
            System.out.println("Positive");
        }else if ( num < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        
        
        num = scanner.nextInt(); // input second number
        if(num >0){
            System.out.println("Positive");
        }else if(num <0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        
        num = scanner.nextInt(); // input third number
        if(num >0){
            System.out.println("positive");
        }else if(num < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        
        
    }
}