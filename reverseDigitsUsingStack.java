package pojana;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int num = 9876;
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + reverseDigitsUsingStack(num));
    }

    public static int reverseDigitsUsingStack(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            int remainder = num % 10;
            stack.push(remainder);
            num /= 10;
        }
        int reversedNum = 0;
        while (!stack.isEmpty()) {
            reversedNum = reversedNum * 10 + stack.pop();
        }
        return reversedNum;
    }
}

