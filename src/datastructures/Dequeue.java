package datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Dequeue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        int n = in.nextInt();
        int m = in.nextInt();

        int unique = 0;
        int maxUnique = Integer.MIN_VALUE;
        int[] cache = new int[10_000_001];

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            if (cache[num]++ == 0)
                ++unique;

            deque.addLast(num);

            if (deque.size() > m) {
                int first = deque.pollFirst();
                if (--cache[first] == 0)
                    --unique;
            }

            if (deque.size() == m)
                if (unique > maxUnique)
                    maxUnique = unique;
        }

        System.out.println(maxUnique);
    }
}
