import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
    
        my_string = my_string.toLowerCase();
        char[] a = my_string.toCharArray();
        int[] b = new int[a.length];
        
        for(int i = 0; i < a.length; i++){
            b[i] = (int)a[i];
        }
        
        Arrays.sort(b);
        
        for(int i = 0; i < b.length; i++){
            answer += (char)b[i];
        }
        
        return answer;
    }
}