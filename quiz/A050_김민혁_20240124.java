package quiz;

import java.util.Scanner;

public class A050_김민혁_20240124 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String oneLine = sc.nextLine();
        char[] beforeConv = oneLine.toCharArray();
        char[] afterConv = new char[beforeConv.length];
        for(int i =0; i<oneLine.length();i++){
            byte invert = (byte)beforeConv[i];
            invert += 3;
            afterConv[i] = (char)invert;
            System.out.print(afterConv[i]);
        }


    }
}
