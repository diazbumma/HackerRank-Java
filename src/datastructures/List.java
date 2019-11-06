package datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class List {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.util.List<Integer> list= new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String query = scanner.next();
            if (query.equals("Insert"))
                list.add(scanner.nextInt(), scanner.nextInt());
            else
                list.remove(scanner.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size()-1)
                System.out.print(list.get(i).toString() + " ");
            else
                System.out.print(list.get(i).toString());
        }
        System.out.print("\n");
    }
}
