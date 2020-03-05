package advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation isOdd() {
        return a -> (a % 2 != 0);
    }

    public static PerformOperation isPrime() {
        return a -> {
            if (a == 2)
                return true;

            boolean prime = true;
            int range = (int) Math.ceil(Math.sqrt(a + 1));

            for (int i = 2; i < range; i++) {
                if (a % i == 0) {
                    prime = false;
                    break;
                }
            }

            return prime;
        };
    }

    public static PerformOperation isPalindrome() {
        return a -> {
            int number = a;
            int reversedNumber = 0;

            do {
                reversedNumber *= 10;
                reversedNumber += a % 10;
                a /= 10;
            } while (a != 0);

            return (number == reversedNumber);
        };
    }
}

public class LambdaExpressions {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
