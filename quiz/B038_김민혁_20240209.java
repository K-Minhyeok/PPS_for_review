package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class B038_김민혁_20240209 {


    public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            int length = sc.nextInt();
            int[] arr = new int[num];


            for (int i = 0; i < arr.length; i++)
                arr[i] = sc.nextInt();

            Arrays.sort(arr);


            for (int i = 0; i < arr.length; i++) {
                if (length >= arr[i])
                    ++length;
            }

            System.out.println(length);
        }
    }
}
