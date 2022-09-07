import java.util.Scanner;

public class feverornot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n > 98) {
                System.out.println("yes");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();

    }

}
