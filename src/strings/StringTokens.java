package strings;

import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] sToken = s.split("[ !,?._'@]+");

        System.out.println(sToken.length);

        for (String item : sToken) {
            System.out.println(item);
        }

        scan.close();
    }
}
