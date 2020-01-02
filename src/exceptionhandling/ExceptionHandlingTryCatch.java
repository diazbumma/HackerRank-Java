package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTryCatch {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x/y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        scanner.close();
    }
}
