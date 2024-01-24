package quiz;

import java.util.Scanner;

public class A052_김민혁_20240124 {

    public static void main(String[] args) {

        for (int j = 0; j < 5; j++) {
            Scanner sc = new Scanner(System.in);
            String oneLine = sc.nextLine();
            char[] beforeConv = oneLine.toCharArray();
            int sum = 0;
            int plus = 0;
            boolean consecutive;
            for (int i = 0; i < oneLine.length(); i++) {

                if (beforeConv[i] == 'O') {
                    plus++;
                    consecutive = true;
                } else {
                    plus = 0;
                    consecutive = false;
                }
                sum += plus;
            }

        }
    }
}