package strings;

import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        if (isAnagram(a, b))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }

    public static boolean isAnagram(String a, String b) {
        char[] aCharArray = a.toLowerCase().toCharArray();
        char[] bCharArray = b.toLowerCase().toCharArray();
        if (aCharArray.length != bCharArray.length)
            return false;
        int[] aFreq = new int[26];
        int[] bFreq = new int[26];
        for (char item : aCharArray)
            aFreq[item - 'a']++;
        for (char item : bCharArray)
            bFreq[item - 'a']++;
        for (int i=0; i<aFreq.length; i++)
            if (aFreq[i] != bFreq[i])
                return false;
        return true;
    }
}
