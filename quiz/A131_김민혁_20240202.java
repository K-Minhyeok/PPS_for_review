package quiz;

import java.util.Scanner;

public class A131_김민혁_20240202 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[8001];


        int sum = 0;
        int max =0;
        int min = 0;

        int median = 10000;
        int mode = 10000;

        for(int i = 0; i < N; i++) {
            int number = in.nextInt();
            sum += number;
            arr[number + 4000]++;

            if(max < number) {
                max = number;
            }
            if(min > number) {
                min = number;
            }
        }




        int count = 0;
        int mode_max = 0;

        boolean check = false;

        for(int i = min + 4000; i <= max + 4000; i++) {

            if(arr[i] > 0) {


                if(count < (N + 1) / 2) {
                    count += arr[i];
                    median = i - 4000;
                }


                if(mode_max < arr[i]) {
                    mode_max = arr[i];
                    mode = i - 4000;
                    check = true;
                }

                else if(mode_max == arr[i] && check == true) {
                    mode = i - 4000;
                    check = false;
                }
            }
        }

        System.out.println((int)Math.round((double)sum / N));
        System.out.println(median);	
        System.out.println(mode);
        System.out.println(max - min);
    }

}

