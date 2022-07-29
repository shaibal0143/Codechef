import java.util.*;

public class testiness {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while (t-- > 0) {
            int a = ob.nextInt();
            int b = ob.nextInt();
            int c = ob.nextInt();
            int d = ob.nextInt();
            int num1, num2;
            if (a > b) {
                num1 = a;
            } else {
                num1 = b;
            }
            if (c > d) {
                num2 = c;
            } else {
                num2 = d;
            }
            System.out.println(num1 + num2);
        }
    }
}
