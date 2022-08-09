import java.util.Scanner;

public class chess  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = scan.nextInt();
            int min = n * 60;
            int times = min / 20;
            System.out.println(times);
        }

    }

}
