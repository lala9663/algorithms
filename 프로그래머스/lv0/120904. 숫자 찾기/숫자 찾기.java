class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String count = Integer.toString(num);
        String[] max = count.split("");
       
      
        for(int i = 0; i < max.length; i++){
            if(k == Integer.parseInt(max[i])){
                answer = i+1;
                break;
            }
            if(k != Integer.parseInt(max[i])){
                answer = -1;
            }
        }
        
        return answer;
    }
}