import java.util.Scanner;

public class StolenDoll {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt(); 
            }
            int x = 0; 
            for (int i = 0; i < n; i++) {
                x = x ^ arr[i];
            }
            System.out.println(x);

        }
        scan.close();
    }

}
 
 
 
 
