package quiz;
import java.util.Scanner;

public class B033_김민혁_20240209 {

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String result = "";

            int[] arr = {300, 60, 10};
            int check = sc.nextInt();

            if (check % 10 != 0) {
                System.out.println("-1");
            } else {
                for (int i = 0; i < arr.length; i++) {
                    result += check / arr[i] + " ";
                    check %= arr[i];
                }
                System.out.println(result);
            }
        }
    }

}
