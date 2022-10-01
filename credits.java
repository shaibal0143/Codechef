import java.util.Scanner;

public class credits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int sum = 4 * a + 2 * b;
            System.out.println(sum);
        }
        scan.close();
    }

}
