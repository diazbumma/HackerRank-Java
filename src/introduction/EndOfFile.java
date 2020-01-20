package introduction;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int i = 0;
        while (read.hasNext()) {
            System.out.println(++i + " " + read.nextLine());
        }
        read.close();
    }
}
