
import java.util.Scanner;

class wireframe {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int t = read.nextInt();
        for (int i = 0; i < t; i++) {
            int n = read.nextInt();
            int m = read.nextInt();
            int x = read.nextInt();
            // Update the code below this line to solve the problem
            int sum = 2 * n + 2 * m;
            System.out.println(sum * x);

        }
        read.close();
    }
}
