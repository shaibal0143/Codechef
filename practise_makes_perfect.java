import java.util.Scanner;

public class practise_makes_perfect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int prob[] = new int[4];
        for (int i = 0; i < 4; i++) {
            prob[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < prob.length; i++) {
            if (prob[i] >= 10) {
                count++;
            }
        }
        System.out.println(count);
    }
}
