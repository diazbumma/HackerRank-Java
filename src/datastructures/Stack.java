package datastructures;

import java.util.Scanner;

public class Stack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();

            java.util.Stack<Character> stack = new java.util.Stack<>();

            for (int i = 0; i < input.length(); i++) {
                if (stack.isEmpty())
                    stack.push(input.charAt(i));
                else {
                    if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[')
                        stack.push(input.charAt(i));
                    else if (input.charAt(i) == ')') {
                        if (stack.peek() == '(')
                            stack.pop();
                        else
                            stack.push(input.charAt(i));
                    }
                    else if (input.charAt(i) == '}') {
                        if (stack.peek() == '{')
                            stack.pop();
                        else
                            stack.push(input.charAt(i));
                    }
                    else if (input.charAt(i) == ']') {
                        if (stack.peek() == '[')
                            stack.pop();
                        else
                            stack.push(input.charAt(i));
                    }
                }
            }

            if (stack.isEmpty())
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
