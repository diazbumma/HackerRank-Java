package strings;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if (isPalindrome(A))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean isPalindrome(String s) {
        StringBuilder reverse = new StringBuilder();

        for (int i = s.length()-1; i >= 0; i--)
            reverse.append(s.charAt(i));

        return s.equals(reverse.toString());
    }
}
