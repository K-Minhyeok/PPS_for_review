package quiz;

import java.util.Scanner;

public class A007_김민혁_20240117 {


    class Solution {
        public void printMelody() {
            // 입력 받음
            Scanner sc = new Scanner(System.in);
            int[] parsedValue = new int[8];
            int index = 0;
            int countAscending = 0;
            int countDescending = 0;

            // parse
            String[] melodyIn = sc.nextLine().split(" ");

            for (String element : melodyIn) {
                parsedValue[index] = Integer.parseInt(element);
                index++;
            }

            String checkingTheMelody;

            //          오름 차순 검사
            for (int i = 0; i < parsedValue.length-1; i++) {
                if (parsedValue[i] < parsedValue[i + 1]) {
                    countAscending ++;

                } else{
                    break;
                }
            }

            //내림 차순 검사
            for (int i = 0; i < parsedValue.length-1; i++) {
                if (parsedValue[i] > parsedValue[i + 1]) {
                    countDescending ++;

                } else {
                    break;
                }

            }

            if(countAscending == 7){
                checkingTheMelody="ascending";
            }else if(countDescending == 7) {
                checkingTheMelody="descending";
            }else{
                checkingTheMelody="mixed";

            }
            System.out.println(checkingTheMelody);
        }
    }
}
