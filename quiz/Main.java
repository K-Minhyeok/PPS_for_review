package quiz;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        HashSet<Integer> proc = new HashSet<>();

        for (int i = 0; i < num; i++) {
            proc.add(sc.nextInt());
        }

        List<Integer> proc2 = new ArrayList<>(proc);
        for (int i=0; i<proc.size();i++){
            System.out.print(proc2.get(i)+" ");
        }

    }
}


