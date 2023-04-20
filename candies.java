import java.util.*;

public class candies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int a[] = new int[n * 2];
            for (int i = 0; i < a.length; i++) {
                a[i] = scan.nextInt();

            }
            int count = 0;
            int count2 = 0;
            for (int j = 0; j < a.length; j++) {

                count = 0;
                for (int k = 0; k < a.length; k++) {
                    if (a[j] == a[k]) {

                        count++;
                    }

                }

                if (count > 2) {
                    System.out.println("no");
                    break;
                } else {
                    count2++;

                }

                if (count2 == a.length) {
                    System.out.println("yes");
                }
                scan.close();
            }

        }
    }

}
