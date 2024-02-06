package quiz;

import java.util.Scanner;

public class A129_김민혁_20240201 {

    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);

        int basic[] = new int [11];

        int num = sc.nextInt();
        basic[1] =1;
        basic[2]=2;
        basic[3]=4;

        for(int i=4;i<=10;i++) {
            basic[i] = basic[i-3] +basic[i-2] + basic[i-1];
        }

        for(int i=0;i<num;i++) {
            int n = sc.nextInt();

            System.out.println(basic[n]);
        }


    }

}