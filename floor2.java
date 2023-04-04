
import java.util.Scanner;
import java.lang.Math;;

public class floor2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int chef_floor = (int) Math.ceil(x / 10.00);
            int chefina_floor = (int) Math.ceil(y / 10.00);
            int diff = Math.abs(chef_floor - chefina_floor);
            System.out.println(diff);

        }
    }

}
