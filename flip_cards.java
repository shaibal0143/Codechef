
import java.util.*;

public class flip_cards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            if (x == 0) {
                System.out.println(0); 
            } else if (x == n) {
                System.out.println(0);
            } else if (x < n / 2) {
                System.out.println(x);
            } else if (x > n / 2) {
                System.out.println(n - x);
            }
        }
    }
}
