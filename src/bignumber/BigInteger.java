package bignumber;

import java.util.Scanner;

public class BigInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.math.BigInteger a = scanner.nextBigInteger();
        java.math.BigInteger b = scanner.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
