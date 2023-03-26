import java.util.*;

public class mario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            if (n % 3 == 0) {
                System.out.println("Normal");
            } else if (n % 3 == 1) {
                System.out.println("Huge");
            } else {
                System.out.println("Small");
            }
        }

    }

}
