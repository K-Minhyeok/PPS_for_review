package quiz;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] seperated = num.split("|");
        List<Integer> result = new ArrayList<>();

        for (int i=0; i<num.length();i++){
            result.add(Integer.parseInt(seperated[i]));
        }
        result.sort(Collections.reverseOrder());

        for (int i=0; i< result.size();i++){
            System.out.print(result.get(i));
        }
    }
}
