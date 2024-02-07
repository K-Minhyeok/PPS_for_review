package quiz;

import java.util.Scanner;

public class A190_김민혁_20240207 {


    public class Main {

        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            int firstIn = sc.nextInt();
            int secondIn = sc.nextInt();
            int thirdIn = sc.nextInt();

            if (firstIn == secondIn && secondIn == thirdIn) {
                System.out.println(10000 + firstIn * 1000);
            } else if (firstIn == secondIn && firstIn != thirdIn) {
                System.out.println(1000 + firstIn * 100);
            } else if (firstIn == thirdIn && firstIn != secondIn) {
                System.out.println(1000 + firstIn * 100);
            } else if (secondIn == thirdIn && secondIn != firstIn) {
                System.out.println(1000 + secondIn * 100);
            } else {
                if (firstIn > secondIn && firstIn > thirdIn)
                    System.out.println(firstIn * 100);
                else if (secondIn > firstIn && secondIn > thirdIn)
                    System.out.println(secondIn * 100);
                else if (thirdIn > firstIn && thirdIn > secondIn)
                    System.out.println(thirdIn * 100);
            }


        }

    }
}