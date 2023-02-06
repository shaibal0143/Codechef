import java.security.Principal;
import java.util.Scanner;

import javax.print.event.PrintEvent;

class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a - b;
            System.out.println(c);

        }
        sc.close();

    }
}