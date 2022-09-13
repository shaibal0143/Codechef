import java.util.Scanner;

public class insurance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x > y) {
                System.out.println(y);
            } else {
                System.out.println(x);
            }
        }
        scan.close();
    }

}
