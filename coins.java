import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            if (a % 10 == 0) {
                System.out.println(a / 10);
            } else if (a % 5 == 0) {
                System.out.println((a / 10) + 1);
            } else {
                System.out.println("-1");
            }
        }
    }
}