import java.util.Scanner;

public class movie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int h = y / 2;
            int sum = (x - y) + h;
            System.out.println(sum);
        }
        scan.close();

    }

}
