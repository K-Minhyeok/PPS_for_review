package quiz;

import java.util.Scanner;
import java.util.Stack;

public class A130_김민혁_20240201 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            if (n == 0) stack.pop();
            else stack.push(n);
        }

        int result = 0;
        while (!stack.isEmpty()) result += stack.pop();

        System.out.println(result);
    }
}

