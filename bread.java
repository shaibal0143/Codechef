import java.util.*;

public class bread {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int k = scan.nextInt();
            int s = m * k;
            if (s >= n) {
                System.out.println("yes");
            } else { 
                System.out.println("no");
            }
        }
    }

}
