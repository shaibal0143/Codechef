import java.util.Scanner;

public class errorsornot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int v = scan.nextInt();
            if (n >= v) {  
                System.out.println("no");
            } else { 
                System.out.println("yes");
            }
        }
        scan.close();
    }

}
