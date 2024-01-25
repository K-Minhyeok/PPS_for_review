package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A077_김민혁_20240125 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> find = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            int num = sc.nextInt();
            find.add(num);
            result.add(num);
        }

        result.sort(Collections.reverseOrder());

        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += result.get(i);
        }
        System.out.println(total);

        for (int i = 0; i < 5; i++) {
            index.add(find.indexOf(result.get(i)));
        }
        Collections.sort(index);
        for (int i = 0; i < 5; i++) {
            System.out.println(index.get(i)+1);
        }
    }

}
