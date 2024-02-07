package quiz;
import java.util.Scanner;

public class A188_김민혁_20240207 {

    public class Main{
        public static void main(String[]args){
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();

            if(0<a && 0<b){
                System.out.println("1");
            }else if(0>a && 0<b){
                System.out.println("2");
            }else if(0>a && 0>b){
                System.out.println("3");
            }else if(0<a && 0>b){
                System.out.println("4");
            }

        }
    }

}
