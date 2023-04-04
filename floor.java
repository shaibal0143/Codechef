import java.util.Scanner;

public class floor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int x = scan.nextInt();
            int b = scan.nextInt();
            int y = scan.nextInt();
            if (a == x && b == y) {
                System.out.println("both");
            } else if (a / x > b / y) {
                System.out.println("chef");
            } else {
                System.out.println("chefina");
            }

        }

    }

}
