package quiz;

public class A006_김민혁_20240116 {
    class Solution {
        boolean solution(String s) {
            boolean answer = true;
            int num_p = 0;
            int num_y = 0;
            String[] test = s.split("|");

            for (int i = 0; i < test.length; i++) {
                if (test[i].contains("p") || test[i].contains("P")) {
                    num_p++;
                } else if (test[i].contains("y") || test[i].contains("Y")) {
                    num_y++;
                }
            }

            if (num_p != num_y)
                answer = false;

            return answer;
        }
    }
}

