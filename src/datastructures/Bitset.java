package datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class Bitset {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet[] bitSet = new BitSet[2];
        bitSet[0] = new BitSet(n);
        bitSet[1] = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String op = scanner.next();
            int input1 = scanner.nextInt()-1;
            int input2 = scanner.nextInt()-1;
            int bitIndex = input2+1;

            switch (op) {
                case "AND":
                    bitSet[input1].and(bitSet[input2]);
                    break;
                case "OR":
                    bitSet[input1].or(bitSet[input2]);
                    break;
                case "XOR":
                    bitSet[input1].xor(bitSet[input2]);
                    break;
                case "FLIP":
                    bitSet[input1].flip(bitIndex);
                    break;
                case "SET":
                    bitSet[input1].set(bitIndex);
                    break;
            }

            System.out.println(bitSet[0].cardinality() + " " + bitSet[1].cardinality());
        }
    }
}
