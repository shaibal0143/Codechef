
import java.util.Scanner;

public class best_price {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt(); 
            int y = scan.nextInt();  
            int z = scan.nextInt();
            int a = scan.nextInt();
            int sum1 = (x - z);
            int sum2 = (y - a);
            if (sum1 > sum2) {
                System.out.println("second");
            } else {
                System.out.println("first");
            }
        }
    }

}
