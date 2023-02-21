
import java.util.*;

public class farm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            if (z % x == 0 && z % y == 0) {
                System.out.println("any");

            } else if (z % x == 0) {
                System.out.println("chicken");
            } else if (z % y == 0) {
                System.out.println("duck");
            } else {
                System.out.println("none");
            }
        }
    }

}
