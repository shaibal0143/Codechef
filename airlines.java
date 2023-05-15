import java.util.*;

public class airlines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            int sum = 10 * x;
            if (sum >= y) {
                System.out.println(y * z);
            } else {
                System.out.println(sum * z);
            }

        }

    } 

}
