import java.util.Scanner;

class atm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            // total cash in the atm
            int x = scan.nextInt();
            // cash dispence
            int n = scan.nextInt();
            String result = "";
            int tmp = 0;
            for (int i = 0; i < n; i++) {
                tmp = scan.nextInt();
                if (tmp <= x) {
                    x = x - tmp;
                    result += ("1");

                } else {
                    result += ("0");
                }
            }

            System.out.println(result);
        }
    }
}