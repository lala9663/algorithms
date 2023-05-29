import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split("");
        String[] answer = new String[arr.length];
        int count = answer.length;
        String temp = "";
        
        for(int i = 0; i < answer.length; i++){
            temp += arr[count-1];
            count--;
            StringBuilder sb = new StringBuilder(temp);
            answer[i] = sb.reverse().toString();
        }
        
        Arrays.sort(answer);

        return answer;
    }
}