import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt(); // cost of blue pen
        int B = sc.nextInt(); // cost of black pen
        
        // Option 1: 3 blue pens
        int option1 = 3 * A;
        
        // Option 2: 1 blue + 1 black
        int option2 = A + B;
        
        // Minimum cost
        int result = Math.min(option1, option2);
        
        System.out.println(result);
    }
}
