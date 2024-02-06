package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A136_김민혁_20240202 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String In1 = br.readLine();
        String In2 = br.readLine();

        int size = In1.length();
        int size2 = In2.length();

        In1 = In1.replace(In2, "");
        System.out.println((size - In1.length()) / size2);
    }
}
