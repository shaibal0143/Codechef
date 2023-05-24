import java.util.Scanner;

public class audible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt(); 
        for (int i = 0; i < t; i++) { 
            int x = sc.nextInt();
            if (x >= 67 && x <= 45000) {
                System.out.println("yes");  
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }

}
