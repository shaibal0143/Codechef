import java.util.Scanner;

public class saleseason {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            int amt = scan.nextInt();
            if (amt < 100) {
                System.out.println(amt);
            } else if (amt > 100 && amt <= 1000) {
                System.out.println(amt - 25);
            } else if (amt > 1000 && amt <= 5000) {
                System.out.println(amt - 100);
            } else if (amt > 5000) {
                System.out.println(amt - 500);
            }
        }
    }

}
