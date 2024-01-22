package quiz;

import java.util.*;

import static java.util.Collections.reverseOrder;

public class A018_김민혁_20240122 {
    public static void main(String[] args) {

        int total=0;

        Scanner sc = new Scanner(System.in);

        int sizeOfArray = sc.nextInt();
        sc.nextLine();

        String originInput = sc.nextLine();
        String[] splitOriginInput= originInput.split(" ");
        int[] arrA = new int[sizeOfArray];

        for(int i =0; i<splitOriginInput.length;i++){
            arrA[i]=  Integer.parseInt(splitOriginInput[i]);
        }
        Arrays.sort(arrA);

        String originInputB = sc.nextLine();
        String[] splitOriginInputB = originInputB.split(" ");

        Integer[] arrB = new Integer[sizeOfArray];
        for(int i =0; i<splitOriginInputB.length;i++){
            arrB[i]=  Integer.parseInt(splitOriginInputB[i]);
        }

        Arrays.sort(arrB, Collections.reverseOrder());


        for(int i=0; i<arrA.length;i++){
            total+=arrA[i]*arrB[i];
        }

        System.out.println(total);


    }
}
