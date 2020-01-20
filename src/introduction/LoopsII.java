package introduction;

import java.util.Scanner;

public class LoopsII {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            query(a, b, n);
        }

        in.close();
    }

    static void query(int a, int b, int n) {
        int tmp;
        for (int i = 1; i <= n; i++) {
            tmp = a;
            for (int j = 0;j < i; j++) {
                tmp += (powInteger(2, j)*b);
            }
            System.out.print(tmp + " ");
        }
        System.out.println();
    }

    static int powInteger(int n, int m) {
        if (m == 0) {
            return 1;
        } else {
            int temp = n;
            for (int i = 1; i < m; i++) {
                temp *= n;
            }
            return temp;
        }
    }
}
