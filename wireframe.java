import java.util.Scanner;

public class wireframe {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); 
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int x = scan.nextInt(); 
            int c = 2 * (n + m) * x;
            System.out.println(c);
        }
        scan.close(); 
    }

}
