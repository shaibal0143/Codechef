import java.util.Scanner;

public class passing_exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            int sum = a + b + c;
            if (sum >= 100) {

                if (a < 10 || b < 10 || c < 10) {
                    System.out.println("Fail");
                } else {
                    System.out.println("Pass");
                }

            } else {
                System.out.println("Fail");
            }
            scan.close();

        }

    }
}
