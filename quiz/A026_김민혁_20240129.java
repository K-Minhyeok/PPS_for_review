package quiz;

public class A026_김민혁_20240129 {

    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            int div = 0;
            int original =x;
            while (x > 0) {
                div += x%10;
                x = x / 10;
            }

            div += x % 10;

            if (original % div == 0) {
                return true;
            } else {
                return false;
            }

        }

    }
}
