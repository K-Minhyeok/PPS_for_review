package quiz;
import java.util.Scanner;

public class B071_김민혁_20240209 {

    public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            int[] arr = new int[num + 1];
            int[] deck = new int[num + 1];

            for (int i = 1; i <= num; i++)
                arr[i] = sc.nextInt();

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    deck[i] = Math.max(deck[i], deck[i - j] + arr[j]);
                }
            }

            System.out.println(deck[num]);

            sc.close();
        }
    }
}
