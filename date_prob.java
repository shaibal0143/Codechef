import java.util.Scanner;

public class date_prob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) { 
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a > b) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }
    }

}
