import java.util.*;

public class plenty_shots {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        while (t-- > 0) {
            int n = 10;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();

            }
            for (int i = 0; i < n; i++) {
                sum1 = arr[1] + arr[3] + arr[5] + arr[7] + arr[9];
                sum2 = arr[0] + arr[2] + arr[4] + arr[6] + arr[8];
            }
            if (sum1 == sum2) {
                System.out.println("0");
            } else if (sum1 < sum2) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }

        }
    }
}
