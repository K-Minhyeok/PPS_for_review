package quiz;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int second = sc.nextInt();

        if(num <= 5){
            for(int i = 0; i < num-1; i++){
                if (second == 0) {
                    second = 1;
                } else {
                    second = 0;
                }

                System.out.println(second);
            }
        }else{
            System.out.println("Love is open door");
        }

    }
}
