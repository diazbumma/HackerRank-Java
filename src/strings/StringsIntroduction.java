package strings;

import java.util.Scanner;

public class StringsIntroduction {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int lengthTotal = A.length()+B.length();
        System.out.println(lengthTotal);

        if (isLexicographicGreater(A, B))
            System.out.println("Yes");
        else
            System.out.println("No");

        char[] charsOfA = A.toCharArray();
        char[] charsOfB = B.toCharArray();
        charsOfA[0] -= 32;
        charsOfB[0] -= 32;
        System.out.println(String.valueOf(charsOfA)+ " " + String.valueOf(charsOfB));
    }

    public static boolean isLexicographicGreater(String firstValue, String secondValue) {
        int lexicograph = firstValue.compareTo(secondValue);
        return lexicograph>0;
    }
}
