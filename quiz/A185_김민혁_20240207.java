package quiz;

import java.util.Scanner;

public class A185_김민혁_20240207 {

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int firstIn = sc.nextInt();
            int secondIn = sc.nextInt();
            if (firstIn > secondIn) {
                System.out.println(">");
            } else if (firstIn < secondIn) {
                System.out.println("<");
            } else if (firstIn == secondIn) {
                System.out.println("==");
            }
        }
    }
}
