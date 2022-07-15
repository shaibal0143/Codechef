import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            int diff = n - x;
            int can = diff / 4;
            System.out.println(can);

        }

    }

}
