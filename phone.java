import java.util.Scanner;

public class phone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x > y) {
                System.out.println("New phone");
            } else if (x < y) {
                System.out.println("Repair");
            } else {
                System.out.println("any");
            }
        }
        scan.close();
    }

}
