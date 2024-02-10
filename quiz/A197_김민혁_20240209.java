package quiz;

import java.io.IOException;
import java.util.Scanner;

public class A197_김민혁_20240209 {
    public class Main {

        public static void main(String[] args) throws IOException {

            Scanner in = new Scanner(System.in);

            int num = in.nextInt();
            int num2 = in.nextInt();

            int arr[] = new int[num];
            int tmp;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }


            for (int j = 0; j < num2; j++) {
                int a = in.nextInt();
                int b = in.nextInt();

                tmp = arr[a - 1];
                arr[a - 1] = arr[b - 1];
                arr[b - 1] = tmp;
            }


            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
}
