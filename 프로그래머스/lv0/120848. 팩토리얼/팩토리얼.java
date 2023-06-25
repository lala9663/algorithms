class Solution {
    public int solution(int n) {
        int answer = 0;
        int pac = 1;
        
        for(int i = 1; i <= 10; i++){
                pac = pac * i;
                answer++;
                if(pac > n){
                    answer--;
                    break;
                }
        }
        
        return answer;
    }
}