package introduction;

import java.util.Scanner;

public class StdinAndStdoutII {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int a = read.nextInt();
        double b = read.nextDouble();
        read.nextLine();
        String c = read.nextLine();

        read.close();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
