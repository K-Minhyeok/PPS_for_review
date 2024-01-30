package quiz;

public class A041_김민혁_20240130 {

    class Solution {
        public String solution(String s) {
            String answer = "";

            String[] tmp=s.toLowerCase().split(" ");

            for(int i=0 ; i<tmp.length;i++){
                String proc = tmp[i];

                if(i!=0) {
                    answer += " ";
                }

                if(proc.equals(" ")){
                    answer = proc;
                }else if(tmp[i].charAt(0)>='A' && tmp[i].charAt(0)<='z'){
                    answer += Character.toUpperCase(proc.charAt(0)) + proc.substring(1);
                }
                else{
                    answer += proc;

                }
                if(" ".equals(s.substring(s.length()-1))){
                    answer+= " ";
                }

            }
            return answer;
        }
    }
}

