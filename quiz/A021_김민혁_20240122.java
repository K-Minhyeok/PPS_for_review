package quiz;

import java.util.Scanner;

public class A021_김민혁_20240122 {
    class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int total = 0;
            int num = sc.nextInt();
            sc.nextLine();


            for(int i=0; i<num;i++){
            total += sc.nextInt();
            sc.nextLine();

            }

            total -= num-1;

            System.out.println(total);

    }

}

}
