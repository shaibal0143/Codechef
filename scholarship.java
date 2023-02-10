import java.util.Scanner;

public class scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n >= 1 && n <= 50) {
                System.out.println("100");
            } else if (n >= 51 && n <= 100) {
                System.out.println("50");
            } else if (n >= 100) {
                System.out.println("0");
            }
        }
        scan.close();

    }

}
