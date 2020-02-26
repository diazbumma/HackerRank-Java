package advanced;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {

    public static String getSHA256(String input) throws RuntimeException {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] hash = md.digest(input.getBytes(StandardCharsets.UTF_8));

            BigInteger number = new BigInteger(1, hash);

            return String.format("%064x", number);

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str = scanner.nextLine();

        System.out.println(getSHA256(str));
    }
}
