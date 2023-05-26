import java.util.Scanner;
import java.lang.Math;

public class expence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(); 
        while (t-- > 0) {
            int n = scan.nextInt();
            int x = scan.nextInt();
            int a = 2;
            double tot;
            for (int i = 1; i <= n; i++) {
                // if(i==1){
                double y = (Math.pow(a, x) - Math.pow(a, x) / 2);
                tot = y;
            }
            System.out.println(tot);

        }
    }
}
