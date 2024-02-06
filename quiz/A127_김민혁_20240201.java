package quiz;

import java.util.Scanner;

public class A127_김민혁_20240201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int k = 0; k < T; k++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int result = 0;

            for (int i = B; i > 0; i--) {
                for (int j = A; j > 0; j--) {
                    if (A * i == B * j) {
                        result = A * i;
                    }
                }
            }
            System.out.println(result);
        }
    }

}
