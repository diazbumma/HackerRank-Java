package introduction;

import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            String s1=sc.next();
            int x=sc.nextInt();

            StringBuilder sb = new StringBuilder();
            sb.append(s1);

            for (int j = 0; j < (15-s1.length()); j++)
                sb.append(' ');

            System.out.print(sb.toString());
            System.out.printf("%03d", x);
            System.out.println();
        }
        System.out.println("================================");
    }
}
