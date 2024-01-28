package quiz;

import java.util.Scanner;

public class A020_김민혁_20240128 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            int ride = in.nextInt();
            int off = in.nextInt();
            sum = sum - off + ride;
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}

