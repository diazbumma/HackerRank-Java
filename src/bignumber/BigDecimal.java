package bignumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BigDecimal {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        List<java.math.BigDecimal> bigDecimals = new ArrayList<>();
        for (int i = 0; i < n; i++)
            bigDecimals.add(new java.math.BigDecimal(s[i]));

        bigDecimals.sort(Collections.reverseOrder());

        String[] newOrder = new String[n];
        int[] indexCache = new int[n+1];

        for (int i = 0; i < bigDecimals.size(); i++) {
            int index = bigDecimals.indexOf(new java.math.BigDecimal(s[i]));
            if (indexCache[index] != 0) {
                while (indexCache[index] != 0)
                    index++;
            }
            indexCache[index]++;
            newOrder[index] = s[i];
        }
        s = newOrder;

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
