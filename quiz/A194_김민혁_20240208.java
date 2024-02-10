package quiz;

import java.util.Scanner;

public class A194_김민혁_20240208 {

    public class Main {
        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);

            int num = in.nextInt();

            for (int i = 1; i <= num; i++) {
                int A = in.nextInt();
                int B = in.nextInt();

                System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
            }

        }
    }
}
