package quiz;

import java.util.Scanner;

public class B031_김민혁_20240209 {

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int firstIn = scanner.nextInt();
            int secondIn = scanner.nextInt();
            int min = Math.abs(firstIn - secondIn);
            int num = scanner.nextInt();
            for (int i = 0; i < num; i++) {
                int tmp = scanner.nextInt();
                min = Math.min(Math.abs(secondIn - tmp) + 1, min);
            }
            System.out.println(min);

        }
    }
}
