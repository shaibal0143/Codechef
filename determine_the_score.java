import java.util.*;

public class determine_the_score {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int x = scan.nextInt(); 
            int n = scan.nextInt();
            int s = x / 10;
            // int sc = s * n;
            System.out.println(s * n); 

        } 
    }

}
 
