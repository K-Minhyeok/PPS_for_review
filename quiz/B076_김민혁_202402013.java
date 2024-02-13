package quiz;
import java.util.*;

public class B076_김민혁_202402013 {

    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int[] numArr = new int[num+1];
            int[] dp = new int[num+1];
            for (int i = 1; i <= num; i++) {
                numArr[i] = sc.nextInt();
                dp[i] = numArr[i];
            }

            int max = 0;
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j < i; j++) {
                    if (numArr[i] < numArr[j]) dp[i] = Math.max(dp[i], dp[j]+numArr[i]);
                }
                max = Math.max(max, dp[i]);
            }
            System.out.print(max);
        }
    }

}
