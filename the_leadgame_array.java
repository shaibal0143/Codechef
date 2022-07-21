import java.util.Scanner;

public class the_leadgame_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int sum1 = 0, sum2 = 0, diff = 0, lead = 0, winner = 0;
        while (t-- > 0) {
            int p1 = scan.nextInt();
            int p2 = scan.nextInt();
            sum1 += p1;
            sum2 += p2;
            if (sum1 > sum2) {
                diff = sum1 - sum2;
                lead = diff;
                winner = 1;
            } else {
                diff = sum2 - sum1;
                lead = diff;
                winner = 2;

            }

        }
        System.out.println(winner + " " + lead);
    }

}
