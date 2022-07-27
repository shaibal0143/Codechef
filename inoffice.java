import java.util.Scanner;

public class inoffice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(4 * x + y);
        }
        scan.close();
    }

}
