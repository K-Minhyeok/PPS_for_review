package quiz;
import java.util.Scanner;
public class B040_김민혁_202402013 {



    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            sc.nextLine();
            String dna = sc.nextLine();

            int[][] dp = new int[2][num];

            if (dna.charAt(0) == 'A') {
                dp[0][0] = 0;
                dp[1][0] = 1;
            } else {
                dp[0][0] = 1;
                dp[1][0] = 0;
            }

            for (int i = 1; i < num; i++) {
                char c = dna.charAt(i);

                if (c == 'A') {
                    dp[0][i] = dp[0][i-1];
                    dp[1][i] = Math.min(dp[1][i-1] + 1, dp[0][i] + 1);
                } else {
                    dp[1][i] = dp[1][i-1];
                    dp[0][i] = Math.min(dp[0][i-1] + 1, dp[1][i] + 1);
                }
            }

            int ans = Math.min(dp[0][num-1], dp[1][num-1] + 1);
            System.out.println(ans);

        }
    }

}
