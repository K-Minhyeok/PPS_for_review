package quiz;

import java.util.*;

public class A035_김민혁_20240123 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            String[] input = sc.nextLine().split(" ");
            double result = Double.parseDouble(input[0]);

            for (int j = 1; j < input.length; j++) {
                String operator = input[j];

                if (operator.equals("@")) {
                    result *= 3;
                } else if (operator.equals("%")) {
                    result += 5;
                } else if (operator.equals("#")) {
                    result -= 7;
                }
            }
            System.out.printf("%.2f\n", result);
        }
    }
}
