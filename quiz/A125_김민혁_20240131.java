package quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A125_김민혁_20240131 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            Integer[] rope = new Integer[num];

            for(int i=0; i<num;i++){
                rope[i] = sc.nextInt();
            }
            Arrays.sort(rope, Collections.reverseOrder());

            int maxWeight = 0;
            for(int i=0; i<num; i++){
                int weight = rope[i]*(i+1);
                if(weight > maxWeight){
                    maxWeight = weight;
                }
            }
            System.out.println(maxWeight);
        }
    }
