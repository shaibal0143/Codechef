import java.util.Scanner;

public class fitness {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int tot = 10 * x;
            System.out.println(tot);
        }

    }

}
