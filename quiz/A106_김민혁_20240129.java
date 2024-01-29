package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A106_김민혁_20240129 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        for(int i=0 ; i<num; i++) {
            boolean[] alphabet = new boolean[26];
            int sum=0;
            String in = sc.nextLine();

            for(int j=0 ; j<in.length(); j++){
                int index = in.charAt(j)-'A';
                alphabet[index] = true;
            }

            for(int j=0 ; j<alphabet.length; j++){
                if(!alphabet[j]){
                    sum +=(j+'A');
                }
            }

            System.out.println(sum);
        }
    }
}
