import java.util.Scanner;

public class best_of_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt(); 
            int b = scan.nextInt();
            if (a > b) {
                System.out.println(a);
            } else { 
                System.out.println(b);
            }
        } 
    }   

}
 
