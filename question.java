import java.util.*;

public class question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int c = a / 100;
            int d = a % 100;
            int e = c + d;
            if (a == 0) {
                System.out.println("0");
            } else if (a > 0 && e <= 10) {
                System.out.println(e);
            } else if (a / 100 == 0) {
                System.out.println(c);
            } else {

                System.out.println("-1");
            }
        }
    }

}
