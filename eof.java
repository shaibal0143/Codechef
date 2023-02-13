import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class eof {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);

        int n = 1;
        while (scan.hasNext()) {
            System.out.println(n++ + " " + scan.nextLine());
        }
        scan.close();
    }
}
