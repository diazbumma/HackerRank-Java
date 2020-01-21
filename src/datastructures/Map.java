package datastructures;

import java.util.HashMap;
import java.util.Scanner;

public class Map {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        java.util.Map<String, Integer> map = new HashMap<>();

        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            if (map.containsKey(s))
                System.out.println(s + "=" + map.get(s));
            else
                System.out.println("Not found");
        }
    }
}
