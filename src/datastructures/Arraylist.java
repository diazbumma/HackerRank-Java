package datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList[] array = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            array[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            for (int j = 0; j < d; j++) {
                array[i].add(scanner.nextInt());
            }
        }
        int q = scanner.nextInt();
        int[] x = new int[q];
        int[] y = new int[q];
        for (int i = 0; i < q; i++) {
            y[i] = scanner.nextInt();
            x[i] = scanner.nextInt();
        }
        for (int i = 0; i < q; i++) {
            if (!array[y[i]-1].isEmpty() && !(array[y[i]-1].size()<=x[i]-1)) {
                System.out.println(array[y[i]-1].get(x[i]-1).toString());
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
