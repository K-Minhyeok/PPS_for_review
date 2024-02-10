package quiz;
import java.util.Scanner;

public class A191_김민혁_20240208 {

    public class Main {
        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);

            int num = in.nextInt();
            int arr[] = new int[num];

            for (int i = 0; i < num; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                arr[i] = a + b;
            }


            for (int k : arr) {
                System.out.println(k);
            }
        }

    }
}
