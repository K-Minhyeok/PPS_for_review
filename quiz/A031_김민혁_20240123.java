package quiz;

import java.util.*;

public class A031_김민혁_20240123 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String originInput = sc.nextLine();
        String[] splitOriginInput = originInput.split(" ");

        int[] arrA = new int[splitOriginInput.length];
        int result = 1;

        for (int i = 0; i < splitOriginInput.length; i++) {
            arrA[i] = Integer.parseInt(splitOriginInput[i]);
            result *= arrA[i];
        }

        System.out.println(result - 1);
    }

}