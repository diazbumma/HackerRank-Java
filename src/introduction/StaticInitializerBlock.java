package introduction;

import java.util.Scanner;

public class StaticInitializerBlock {

    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner read = new Scanner(System.in);
        B = read.nextInt();
        H = read.nextInt();
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = true;
        }
    }

    public static void main(String[] args){
        if (flag) {
            int area = B*H;
            System.out.print(area);
        }

    }//end of main

}
