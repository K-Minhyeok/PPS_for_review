package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class A047_김민혁_20240124 {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String N = sc.nextLine();

            int count = 0;

            for (int i = 0; i < N.length(); i++) {
                System.out.print(N.charAt(i));
                count++;
                if (count == 10) {
                    System.out.println();
                    count = 0;
                }
            }

        }
    }