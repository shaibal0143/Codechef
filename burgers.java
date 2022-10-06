import java.util.Scanner;

public class burgers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a < b) {
                System.out.println(a);
            } else if (a > b) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        } 
    }

}
