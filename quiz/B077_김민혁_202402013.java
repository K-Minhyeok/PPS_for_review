package quiz;
import java.math.BigInteger;
import java.util.Scanner;
public class B077_김민혁_202402013 {



    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println(fib(sc.nextInt()));

        }

        public static BigInteger fib(int n) {
            BigInteger firstIn = BigInteger.valueOf(1);
            BigInteger secondIn = BigInteger.valueOf(1);
            BigInteger tmp;
            for (int j = 2; j <= n; j++) {
                tmp = firstIn.add(secondIn);
                firstIn = secondIn;
                secondIn = tmp;
            }

            return (firstIn);
        }
    }

}
