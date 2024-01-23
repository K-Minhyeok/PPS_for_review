package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class A034_김민혁_20240123 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> remainder = new HashSet<>();

        for (int i=0; i<10;i++){
            int in = sc.nextInt();
            in = in % 42;
            remainder.add(in);
        }

        System.out.println(remainder.size());
    }
}