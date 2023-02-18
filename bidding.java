
import java.util.*;

public class bidding {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {  
            int A = sc.nextInt(); 
            int B = sc.nextInt();
            int C = sc.nextInt();

            if (A > B && A > C) { 
                System.out.println("Alice");
            } else if (B > A && B > C) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }
        sc.close();

    }

} 
