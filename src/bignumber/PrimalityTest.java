package bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        java.math.BigInteger number = new BigInteger(n);
        if (number.isProbablePrime(1))
            System.out.println("prime");
        else
            System.out.println("not prime");
        scanner.close();
    }
}
