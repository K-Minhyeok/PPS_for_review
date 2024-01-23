package quiz;

import java.util.Scanner;

public class A032_김민혁_20240123 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] numOfpeople = new int[15][15]; //앞이 층  뒤가 호

        for (int i = 0; i < 15; i++) {
            numOfpeople[i][1] = 1;
            numOfpeople[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                numOfpeople[i][j] = numOfpeople[i][j-1] + numOfpeople[i-1][j];
            }
        }


        int getFloor = sc.nextInt();

        for(int i=0; i<getFloor;i++) {
            int floor = sc.nextInt();
            int num = sc.nextInt();
            System.out.println(numOfpeople[floor][num]);
        }
    }
}