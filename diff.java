import java.util.Scanner;

public class diff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a > b) {
                System.out.println(a - b);
            } else {
                System.out.println(0);
            }
        }
        scan.close();.
    }

}
