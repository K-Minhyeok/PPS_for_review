package quiz;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();


        for (int j = 0; j < num; j++) {
            String oneLine = sc.nextLine();
            char[] beforeConv = oneLine.toCharArray();
            int sum = 0;
            int plus = 0;
            boolean consecutive;
            for (int i = 0; i < oneLine.length(); i++) {

                if (beforeConv[i] == 'O') {
                    plus++;
                    consecutive = true;
                } else {
                    plus = 0;
                    consecutive = false;
                }
                sum += plus;
            }
            System.out.println(sum);
        }

    }
}