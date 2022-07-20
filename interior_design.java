import java.util.Scanner;

public class interior_design {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            int s1 = x1 + y1;
            int s2 = x2 + y2;
            if (s1 > s2) {
                System.out.println(s2);
            } else {
                System.out.println(s1);
            }
        }
    }

}
