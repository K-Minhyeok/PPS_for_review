package quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class A004 {

    class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer;
//  입력 받은 숫자 갯수만큼 answer메모리 할당
//  > idx =0 변수 만들어서 나눠지면 answer[idx] 후 idx ++ 하고
//  > 반복문 이후에 idx=0이면 그 안에 -1 넣으려고 했음
//            실수한 거 = answer 안에는 나눠 떨어지는 숫자 갯수만큼만 할당되어야함
//            입력 받은 숫자 갯수 != 나누어떨어지는 숫자 갯수

             int count =0;
            ArrayList<Integer> tmp_for_cal = new ArrayList<>();

            for(int pass:arr){
                if(pass % divisor ==0){
                    count ++;
                    tmp_for_cal.add(pass);
                }
            }

            if(count==0){
                int no_result=-1;
                tmp_for_cal.add(no_result);
                answer = new int[]{-1};
            }else {

                answer = new int[count];

            }
            for(int i=0 ; i<tmp_for_cal.size();i++){
                answer[i]=tmp_for_cal.get(i);
            }

            Arrays.sort(answer);

            return answer;

        }
    }
}
