package datastructures;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int largest = arr[0][0] + arr[0][1] + arr[0][2] + arr[1][1] + arr[2][0] + arr[2][1] + arr[2][2];
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                int temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                        arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (temp>largest)
                    largest = temp;
            }
        }
        System.out.println(largest);
        scanner.close();
    }
}
