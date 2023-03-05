import java.util.*;

public class average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int c = scan.nextInt();
            int sum = a + c;
            if (sum % 2 == 0) {
                System.out.println(sum / 2);

            } else {
                System.out.println(-1);
            }
        }
    }

}
