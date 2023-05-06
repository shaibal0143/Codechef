import java.util.Scanner;

 public class Easy_to_pronoun { 
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int t = scan.nextInt();
        while (t-- > 0) {
            int count = 0; 
            int n = scan.nextInt(); 
            String s = scan.next(); 
            for (int i = 0; i < n; i++) {  
                char ch = s.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count = 0; 

                } else {
                    count++;
                    if (count > 3)
                        break;

                }

            }
            if (count < 4) {
                System.out.println("yes");
            } else { 
                System.out.println("no");
            }
  
        }
        scan.close();
    }
}
  
