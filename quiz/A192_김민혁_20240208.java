package quiz;
import java.util.Scanner;

public class A192_김민혁_20240208 {

    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int num = in.nextInt();
            int sum = 0;

            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
