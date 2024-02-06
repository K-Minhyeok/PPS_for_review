package quiz;

import java.util.Scanner;

public class A151_김민혁_20240203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int in[][] = new int [n][n];

        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                in[i][j] = sc.nextInt();
            }
        }

        for(int i=1;i<n;i++) {
            for(int j=0;j<=i;j++) {
                if(j-1>=0)
                    in[i][j]+=Math.max(in[i-1][j], in[i-1][j-1]);
                else
                    in[i][j]+=in[i-1][j];
            }
        }

        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            if(max<in[n-1][i])
                max = in[n-1][i];
        }

        System.out.println(max);

    }

}

