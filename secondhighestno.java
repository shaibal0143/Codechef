import java.util.Scanner;

public class secondhighestno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if ((a > b && a < c) || (a < b && a > c)) {
                System.out.println(a);
            } else if ((b > c && b < a) ||( b < c && b > a)) {
                System.out.println(b);
            } else { 
                System.out.println(c);
            }
        }
    }

}
