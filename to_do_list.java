import java.util.Scanner;

public class to_do_list {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int num[] = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = scan.nextInt();
            }
            int count = 0;
            for (int i = 0; i < num.length; i++) {
                if (num[i] >= 1000) {
                    count++;

                }

            }
            System.out.println(count);

        }
    }
}
