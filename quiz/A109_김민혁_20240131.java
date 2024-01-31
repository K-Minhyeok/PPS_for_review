package quiz;

import java.util.Scanner;

public class A109_김민혁_20240131 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pay = sc.nextInt();
        int result = 1000 - pay;
        int count = 0;

        while (result > 0) {

            if (result >= 500) {
                count++;
                result -= 500;
                continue;

            }
            if (result >= 100) {
                count++;
                result -= 100;
                continue;

            }
            if (result >= 50) {
                count++;
                result -= 50;
                continue;

            }
            if (result >= 10) {
                count++;
                result -= 10;
                continue;

            }
            if (result >= 5) {
                count++;
                result -= 5;
                continue;

            }

            if (result >= 1) {
                count++;
                result -= 1;
                continue;

            }


        }
        System.out.println(count);
    }
}
