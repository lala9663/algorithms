class Solution {
    public int[] solution(int start, int end) {
        int result = start-end+1;
        int[] answer = new int[result];
        
        
        for(int i = 0; i<result; i++){
            answer[i] = start;
            start--;
        }
        return answer;
    }
}