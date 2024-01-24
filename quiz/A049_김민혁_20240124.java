package quiz;

import java.util.Scanner;

public class A049_김민혁_20240124 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = true;

        while (exit) {
            int a = 0;
            int b = 0;
            boolean isAcceptable = true;
            String in = sc.nextLine();

            if (in.equals("end")) {
                exit = false;
            } else {

                for (int i = 0; i < in.length() - 1; i++) {
                    char currentChar = in.charAt(i);
                    char nextChar = in.charAt(i + 1);

                    // 같은 글자가 연속으로 두 번 오면서 ee 또는 oo가 아닌 경우
                    if (currentChar == nextChar && !(currentChar == 'e' || currentChar == 'o')) {
                        isAcceptable = false;
                        break;
                    }

                    if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'
                            || currentChar == 'u') {
                        a++;
                        b = 0;
                        if (a > 2) {
                            isAcceptable = false;
                            break;
                        }
                    } else {
                        b++;
                        a = 0;
                        if (b > 2) {
                            isAcceptable = false;
                            break;
                        }
                    }
                }

                char lastChar = in.charAt(in.length() - 1);
                if (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u') {
                    a++;
                    if (a > 2) {
                        isAcceptable = false;
                    }
                } else {
                    b++;
                    if (b > 2) {
                        isAcceptable = false;
                    }
                }
                if (a == 0) {
                    isAcceptable = false;
                }
                if (isAcceptable) {
                    System.out.println("<" + in + "> is acceptable.");
                } else {
                    System.out.println("<" + in + "> is not acceptable.");
                }
            }
        }
    }
}


