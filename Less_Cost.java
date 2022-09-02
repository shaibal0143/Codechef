
import  java.util.Scanner;

public class Less_Cost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            float x = scan.nextInt();
            float y = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            float sum1 = (x / a) * n;
            float sum2 = (y / b) * n;
            if (sum1 > sum2) {
                System.out.println("dieasel");
            } else if (sum1 < sum2) {
                System.out.println("petrol");
            } else {
                System.out.println("any");
            }

        }
        scan.close();
    }

}
