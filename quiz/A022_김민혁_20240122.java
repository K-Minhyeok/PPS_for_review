package quiz;

import java.util.Scanner;
import java.util.*;

public class A022_김민혁_20240122 {

    public class Main {
        public static void main(String[] args) {

            int priceY = 0;
            int priceM = 0;

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < num; i++) {
                int callDuration = sc.nextInt();

                priceY += (callDuration/30+1) *10;
                priceM += (callDuration/60+1) *15;
            }

            if (priceY < priceM) {
                System.out.println("Y " + priceY);
            } else if (priceY > priceM) {
                System.out.println("M " + priceM);
            } else {
                System.out.println("Y M " + priceY);
            }
        }
    }
}

