import java.util.Scanner;

public class roller_coaster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int h = scan.nextInt();
            if (x >= h) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

}
