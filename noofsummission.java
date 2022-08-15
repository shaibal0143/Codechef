import java.util.Scanner;

public class noofsummission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            int min = scan.nextInt();
            int sec = min * 60;
            int sum = sec / 30;
            System.out.println(sum);
        }
        scan.close();
    }

}
