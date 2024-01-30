package quiz;

import java.util.Scanner;

public class A108_김민혁_20240130 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int original = sc.nextInt();
            int tmp = original;
            int result=0;
            boolean symmetric = true;

            while (tmp > 0) {
                result *=10;
                int symNum = tmp % 10;
                tmp = tmp/10;
                result += symNum;
            }
            String origin = Integer.toString(original);
            String resu = Integer.toString(result);

            for (int j=0 ; j < origin.length(); j++){
                if(origin.charAt(j)==resu.charAt(origin.length()-j-1)){

                }else{
                    symmetric=false;
                }

            }
            if(symmetric){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }
}