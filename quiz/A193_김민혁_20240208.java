package quiz;
import java.util.Scanner;


public class A193_김민혁_20240208 {
    public class Main {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int num = in.nextInt();
            int a = num / 4;
            for (int i = 0; i < a; i++) {
                System.out.print("long");
            }
            System.out.print("int");
        }

    }
}