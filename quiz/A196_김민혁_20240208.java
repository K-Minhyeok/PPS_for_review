package quiz;
import java.util.Scanner;

public class A196_김민혁_20240208 {

    public class Main {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);


            int num = in.nextInt();
            int[] arr = new int[num];


            int count = 0;
            for(int i = 0; i < num; i++) {
                arr[i] = in.nextInt();
            }

            int b = in.nextInt();

            for (int i : arr) {
                if (b == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
