package quiz;

import java.util.Scanner;
import java.math.BigInteger;

public class A028_김민혁_20240128 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger firstIn = new BigInteger(in.next());
        BigInteger secondIn = new BigInteger(in.next());

        System.out.println(firstIn.add(secondIn));
    }
}

