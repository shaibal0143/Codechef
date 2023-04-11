
import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int pos = 0;
            int neg = 0;
            int divk = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0)

                {
                    pos++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] < 0)

                {
                    neg++;
                }
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] % k == 0)

                {
                    divk++;
                }
            }
            System.out.println(pos);
            System.out.println(neg);
            System.out.println(divk);

        }
    }
}
