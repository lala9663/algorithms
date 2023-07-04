class Solution {
    public int solution(int order) {
        int answer = 0;
        String clap = Integer.toString(order);
        
        for(int i = 0; i < clap.length(); i++) {
            char digit = clap.charAt(i);
            if(digit == '3' || digit == '6' || digit == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}
