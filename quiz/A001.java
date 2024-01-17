package quiz;

import java.util.Arrays;

public class A001 {
    class Solution {

//  1. 받은 배열들 오름차순 정렬
//  2. merge sort같이 배열 g와 s에서 가장 작은 것들끼리 매칭이 되는지 본다.
//    1) 매칭이 됐을 땐 만족한 아이수를 늘려줌
//         매칭이 안 됐을 땐 , 그 다음 쿠키로 본다 ( 오름 차순이라 가능 )

        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int num_happy_child = 0;

            int child = 0;
            int cookie = 0;

            while (child < g.length && cookie < s.length) {
                if (g[child] <= s[cookie]) {
                    num_happy_child++;
                    child++;
                }
                cookie++;
            }

            return num_happy_child;
        }
    }





}
