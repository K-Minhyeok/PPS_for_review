package quiz;

import java.util.*;

public class Main {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String in = scanner.nextLine();
            int size = in.length();
            String[] proc = new String[size];

            for(int i=0; i<size; i++) {
                proc[i] = in.substring(i, size);
            }

            Arrays.sort(proc);

            for (String str : proc) {
                System.out.println(str);
            }
        }
    }