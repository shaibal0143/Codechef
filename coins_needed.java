import java.util.Scanner;

public class coins_needed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) { 
            int n = scan.nextInt();
            int c = n % 10; 
            System.out.println(c);
        } 
    }

}
