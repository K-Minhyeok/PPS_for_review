package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class A046_김민혁_20240124 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        HashMap<Character, Integer> playerCount = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String lastName = sc.nextLine();
            char initial = lastName.charAt(0);

            playerCount.put(initial, playerCount.getOrDefault(initial, 0) + 1);
        }

        List<Character> player = new ArrayList<>();

        for (char initial : playerCount.keySet()) {
            if (playerCount.get(initial) >= 5) {
                player.add(initial);
            }
        }

        if (player.size() == 0) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(player.toString());
        }


    }
}