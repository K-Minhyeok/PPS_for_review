package quiz;

import java.util.*;

public class A083_김민혁_20240125 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        HashSet<Integer> proc = new HashSet<>();

        for (int i = 0; i < num; i++) {
            proc.add(sc.nextInt());
        }

        List<Integer> proc2 = new ArrayList<>(proc);

        // Add this line to sort the list
        Collections.sort(proc2);

        for (int i=0; i<proc2.size();i++){
            System.out.print(proc2.get(i)+" ");
        }
    }
}
