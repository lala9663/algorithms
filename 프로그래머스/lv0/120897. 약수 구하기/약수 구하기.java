class Solution {
    public int[] solution(int n) {
        int[] list = new int[10000];
        int num = 0;
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                list[num] = i;
                num++;
            }
        }
        int[] answer = new int[num];
        for(int i = 0; i <num; i++){
            if(list[i] != 0){
                answer[i] = list[i];
            }
        }
        
        return answer;
    }
}