package quiz;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String choice;
        int priceY;
        int priceM;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();


        String duration = sc.nextLine();

        String[] splitOriginInput= duration.split(" ");

        int callDuration =0;

        for (String s : splitOriginInput) {
            callDuration += Integer.parseInt(s);
        }

        priceY = (callDuration/30)*10;
        if(priceY%30>0){
            priceY+=10;
        }

        priceM = (callDuration/60)*15;
        if(priceM%60>0){
            priceM+=15;
        }

        if(priceY>priceM){
            choice = "Y";
        }else{
            choice="M";
        }

        System.out.println(choice);







    }

}

