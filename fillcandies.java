import java.util.Scanner;

public class  fillcandies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();// total no. of candies
            int k = scan.nextInt();// total no of pockets
            int m = scan.nextInt();// each pocket can hold
            int p = k * m;
            if (n < p) {
                System.out.println("1");
            } else if (n % p > 0) {
                System.out.println(n / (k * m) + 1);
            } else if (n % p == 0) {
                System.out.println(n / (k * m));
            }
        }
        scan.close();
    }

}
