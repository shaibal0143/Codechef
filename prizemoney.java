import java.util.*;

public class prizemoney {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(10 * x + 90 * y);
        }
        scan.close();
    }

}
