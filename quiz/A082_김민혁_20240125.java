package quiz;

import java.util.*;

public class A082_김민혁_20240125 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[][] info = new String[num][2];

        for (int i = 0; i < num; i++) {
            info[i][0] = sc.next();
            info[i][1] = sc.next();
        }

        Arrays.sort(info, Comparator.comparing(a -> Integer.parseInt(a[0])));

        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i][0] + " " + info[i][1]);
        }
    }
}