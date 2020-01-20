package introduction;

import java.util.Scanner;

public class IfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num = scanner.nextInt();
        scanner.close();

        String weird = "Weird";
        String notWeird = "Not Weird";

        if (num % 2 != 0)
            System.out.println(weird);
        else if (num >= 2 && num <= 5)
            System.out.println(notWeird);
        else if (num >= 6 && num <= 20)
            System.out.println(weird);
        else if (num >= 20)
            System.out.println(notWeird);
    }
}
