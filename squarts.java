import java.util.Scanner;

public class squarts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int sum = 15 * a;
            System.out.println(sum);
        }

    }

}
