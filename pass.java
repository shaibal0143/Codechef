import java.util.Scanner;

public class pass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            int p = scan.nextInt();
            int tot_mar = x * 3 - ((n - x));
            if (tot_mar >= p) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }

        }
    }

}
