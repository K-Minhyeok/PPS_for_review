package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A033_김민혁_20240123 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] score = new int[5];
        int max=-1;
        int who=-1;
        int sum;

        for(int i=0; i<5;i++){
            sum=0;
            for(int j=0;j<4;j++){
                int in = sc.nextInt();
                sum+= in;
            }
            score[i] = sum;
            if(score[i]>max){
                max= score[i];
                who = i;
            }
        }
        System.out.println((who+1) + " " + max);
    }
}