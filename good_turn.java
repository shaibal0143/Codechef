import java.util.Scanner;

public class good_turn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = a + b;
            if (c > 6) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

}
