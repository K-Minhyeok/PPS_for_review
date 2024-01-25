package quiz;

import java.util.*;

public class A081_김민혁_20240125 {

    public static void main(String[] args) {
        int i, j, count;
        int[] num = new int[10];
        int[] third;

        Scanner s = new Scanner(System.in);
        count = s.nextInt();
        third = new int[count];

        for (i = 0; i < count; i++) {
            for (j = 0; j < 10; j++) {
                num[j] = s.nextInt();
            }
            Arrays.sort(num);
            third[i] = num[7];
        }

        for (j = 0; j < count; j++) {
            System.out.println(third[j]);
        }
    }
}
