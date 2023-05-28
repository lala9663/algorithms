import java.util.Arrays;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int d = c-1;
        
        String[] arr = my_string.split("");
        for(int i = 0; i < arr.length; i++){
            if(m==1){
                answer = my_string;
            }else if((i)%m == d){
                answer += arr[i];
            }
        }
        
        return answer;
    }
}