import java.util.Scanner;

public class cadies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) { 
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = a / b;
            if ((a % b == 0) && (c % 2 == 0)) {
                System.out.println("Yes");
            } else {
                System.out.println("no");
            }
        }

    }

}
