package quiz;

import java.io.*;
import java.util.*;

public class A153_김민혁_20240206 {

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            int[] arr = new int[num];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < num; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int sum = 0;
            int add = 0;
            for (int i = 0; i < num; i++) {
                add += arr[i];
                sum += add;
            }
            System.out.print(sum);
        }
    }
}
