import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean isBalanced(String expression) {
        Stack < Character > stack = new Stack < > ();

        for (char ch: expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String expression = sc.nextLine();

            boolean result = isBalanced(expression);

            System.out.println(expression + " : " + result);
        }

        sc.close();

    }
}