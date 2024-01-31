package quiz;

import java.util.Scanner;

public class A111_김민혁_20240131 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i<num ;i ++){
            int stop = sc.nextInt();
            double people = 0;
            for(int j=0; j<stop ; j++){
                people = (people + 0.5) * 2;
            }
            System.out.println((int)people);
        }
    }
}