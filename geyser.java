import java.util.Scanner;

public class geyser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = 2 * y;
            if (z > x) {
                System.out.println(0);
            } else if (z < x) {
                System.out.println(x / z);
            }
        }

    }

}
