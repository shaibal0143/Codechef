import java.util.*;

public class tomandjerry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int j = scan.nextInt();
            int T = scan.nextInt();
            if (j >= T) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }

        }
        scan.close();
    }

}
