class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int num = 0;
        int num2 = 1;
        
        for(int i = 0; i < num_list.length; i++){
            num += num_list[i];
            num2 *= num_list[i];
        }
        
        if(num*num > num2){
            answer = 1;
        } else{
            answer = 0;
        }
        
        return answer;
    }
}