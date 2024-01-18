package quiz;


import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class A015_김민혁_20240117 {

    class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String num = sc.nextLine();
            String[] numArr = num.split(" ");
            int totalNumber =0;
            int tmp;

            for(int i=0 ; i<numArr.length; i++){
                tmp = Integer.parseInt(numArr[i]);
                totalNumber += tmp*tmp;
            }

            System.out.println(totalNumber%10);
        }


    }

}
