package quiz;

import java.util.Scanner;

public class A029_김민혁_20240122 {

        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.nextLine();
            int second = sc.nextInt();


            if(num > 5){
                System.out.println("Love is open door");
            }else{
                if(second==0){
                    System.out.println("0");
                    second=0;
                }else if(second==1){
                    System.out.println("1");
                    second=1;
                }
            }

        }
    }


