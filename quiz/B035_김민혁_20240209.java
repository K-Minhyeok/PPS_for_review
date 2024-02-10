package quiz;
import java.util.Scanner;

public class B035_김민혁_20240209 {


    public class Main {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int num = in.nextInt();
            int cost = in.nextInt();

            int[] coin = new int[num];

            for(int i = 0; i < num; i++) {
                coin[i] = in.nextInt();
            }

            int count = 0;

            for(int i = num - 1; i >= 0; i--) {

                if(coin[i] <= cost) {
                    count += (cost / coin[i]);
                    cost = cost % coin[i];
                }
            }
            System.out.println(count);
        }

    }
}
