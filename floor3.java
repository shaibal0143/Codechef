import java.util.Scanner;

public class floor3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            int total_time = x * y;
            int num_breaks = x / 3;
            int time_spent_on_breaks = num_breaks * z;
            total_time += time_spent_on_breaks;
            System.out.println(total_time);
        }
        scan.close();

    }

}
