import java.util.Scanner;

public class find_small_large {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();

            }
            int small = arr[0];
            int large = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] < small) {
                    small = arr[i];
                }
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] > large) {
                    large = arr[i];
                }
            }
            System.out.println(small + " " + large);
        }
    }
}