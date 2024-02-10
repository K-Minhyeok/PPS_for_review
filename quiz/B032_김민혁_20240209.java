package quiz;

import java.util.*;

public class B032_김민혁_20240209 {

    class Main {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int Num = sc.nextInt();

            int count = 2;

            int res = 0;
            Integer arr[] = new Integer[Num];
            for (int i = 0; i < Num; i++) {
                arr[i] = sc.nextInt();
            }


            Arrays.sort(arr, Collections.reverseOrder());

            for (int i = 0; i < Num; i++) {
                res = Math.max(res, count + arr[i]);
                count++;
            }

            System.out.println(res);
        }
    }


}
