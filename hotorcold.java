import java.util.Scanner;

public class hotorcold {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            if (x > 20) {
                System.out.println("hot");
            } else {
                System.out.println("cold");
            }
        }
        scan.close();
    }

}
