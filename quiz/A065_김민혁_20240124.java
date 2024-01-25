package quiz;

import java.util.*;

public class A065_김민혁_20240124 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer[]> point = new ArrayList<>();
        int x;
        int y;

        for (int i = 0; i < num; i++) {
            x=sc.nextInt();
            y=sc.nextInt();

            point.add(new Integer[]{x,y});
        }

        point.sort((point1, point2) -> {
            if(point1[0].equals(point2[0])) {
                return point1[1] - point2[1];
            } else {
                return point1[0] - point2[0];
            }
        });
        for(Integer[] arr : point) {
            System.out.println(arr[0]+" "+ arr[1]); // arr[0]는 x값에 해당합니다.
        }

    }

}