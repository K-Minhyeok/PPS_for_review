package quiz;


public class A009_김민혁_20240117 {
        public class Solution {
            public boolean solution(String s) {
                boolean answer=true;

                int inputLineLength = s.length();
                String[] procIsNumber = s.split("");

                for (String string : procIsNumber) {
                    if ((inputLineLength == 4 || inputLineLength == 6) && isNumber(string)) {
                    } else {
                        answer = false;
                    }
                }
                return answer;
            }



            public boolean isNumber(String input) {
                try {
                    Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    return false;
                }
                return true;
            }
        }
    }

