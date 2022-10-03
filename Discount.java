import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int dis = (100 - x);
            System.out.println(dis);
         }
        scan.close();
    }

}
 
 
 
