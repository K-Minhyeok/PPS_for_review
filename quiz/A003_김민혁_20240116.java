package quiz;



public class A003_김민혁_20240116 {
    class Solution {
        public int[] plusOne(int[] digits) {

            int last = digits.length-1;

            System.out.println(digits[last]);

            for(int i=last ; i>0 ; i--) {
                if (digits[last] < 9) { // 9가 아닐 때를 걸러주고,
                    digits[last]++;
                    return digits;      //9가 아니면 끝에만 +1하고 끝
                }
                //기본이 9라고 가정하고 0으로 초기화 한다. ex) 199 → 200 이 되어야 하니까 반복문에 넣어주고 0으로.
                digits[i]=0;

            }
//            for 문에서 return되지 않고 나왔다는 건 99...9 이런 뜻이므로 한 칸을 늘려줘야한다.

            int[] result_digits = new int[digits.length+1];
            result_digits[0]=1;
            for(int i=1 ; i<result_digits.length;i++){
                result_digits[i] = 0;
            }

            return result_digits;
        }
    }
}
