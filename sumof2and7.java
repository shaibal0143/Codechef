import java.util.Scanner;

public class sumof2and7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();

            if (n % 2 == 0 || n % 7 == 0 || (2 + 7) <= n) {
                System.out.println("yes");
            } else {
                System.out.println("NO");
            }

        }
    }

}
