package quiz;
import java.util.*;

public class B075_김민혁_202402013 {
    public class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            int[] dp = new int[100001];
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 2;
            dp[4] = 2;
            dp[5] = 1;
            dp[6] = 2;
            dp[7] = 1;
            for (int i = 8; i <= num; i++) {
                dp[i] = Math.min(dp[i-1], Math.min(dp[i-2], Math.min(dp[i-5], dp[i-7]))) +1;
            }
            System.out.print(dp[num]);
        }
    }

}
