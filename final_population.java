import java.util.Scanner;

public class final_population {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt(); 
            System.out.println(x - y + z);
        }
    }

}
