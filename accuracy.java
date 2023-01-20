import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class accuracy {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int mid =  (x + y) / 2;  
            if (x > mid) {  
                int dig = x - mid;
                System.out.println(dig);  
            } else {   
                int dig1 = y - mid;
                System.out.println(dig1); 
            }
        }
        scan.close();
    }

}
 
 
 
