import java.util.Scanner;

public class buylamps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) { 
            int n = scan.nextInt(); 
            int k = scan.nextInt(); 
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x > y) {
                System.out.println((n - k) * y + k * x);
            } else {
                System.out.println(n * x);
            }

        }
        scan.close();

    }

}
