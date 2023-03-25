import java.util.Scanner;

public class shoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n <= m) {
                System.out.println(n);
            } else {
                System.out.println(2 * n - m);
            }
        }
    }

}
