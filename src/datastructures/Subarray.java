package datastructures;

import java.util.Scanner;

public class Subarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        int count = 0;
        for (int i = 0 ; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                int temp = 0;
                for (int k = 0; k <= i; k++) {
                    if (k+j < n) {
                        temp += array[k + j];
                        //System.out.print(array[k+j] + " + ");
                    }
                }
                if (temp < 0)
                    count++;
                //System.out.println(" = " + temp);
            }
        }
        System.out.println(count);
    }
}
