class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        String[] code1 = cipher.split("");
        for(int i = 0; i < code1.length; i++) {
            if((i+1) % code == 0 ) {
                answer += code1[i];
            }
        }
            
        return answer;
    }
}