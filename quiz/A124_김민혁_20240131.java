package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

public class A124_김민혁_20240131 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int div = 2;
        List<Integer> result = new ArrayList<>();
        while (num != 1) {
            if (num % div == 0) {
                result.add(div);
                num /= div;
            } else {
                div++;
            }
        }
        Collections.sort(result);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
