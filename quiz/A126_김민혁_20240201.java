package quiz;

import java.util.Scanner;

public class A126_김민혁_20240201 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i <= 99) {
                count += 1;
            } else if (i <= 999) {
                String[] num_tmp = Integer.toString(i).split("");
                if ((Integer.parseInt(num_tmp[1]) - Integer.parseInt(num_tmp[0])) == (Integer.parseInt(num_tmp[2]) - Integer.parseInt(num_tmp[1]))) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}

