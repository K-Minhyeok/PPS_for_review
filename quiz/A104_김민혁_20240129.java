package quiz;

import java.util.*;

public class A104_김민혁_20240129 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> cost = new ArrayList<>();
        int max = 0;

        for(int i=0; i<num; i++) {
            cost.add(sc.nextInt());
        }
        cost.remove(Collections.max(cost));
        int sum = cost.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);
    }
}

