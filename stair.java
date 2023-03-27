import java.util.Scanner;

class stair {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x % y == 0) {
                System.out.println(x / y);
            } else {
                System.out.println(x / y + x % y);
            }

        }
        scan.close();

    }
}