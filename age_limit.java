import java.util.Scanner;

public class age_limit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int a = scan.nextInt();
            if (a >= x && a < y) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}
