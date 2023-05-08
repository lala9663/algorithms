class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i = 1; i <food.length; i++){
            if(food[i]/2 >= 1){
                int count = food[i]/2;
                while(count > 0){
                    answer += Integer.toString(i);
                    count --;
                }
            }
        }
        
        answer += "0";
        
        for(int i = food.length-1; i >= 1; i--){
            if(food[i]/2 >= 1){
                int count = food[i]/2;
                while(count > 0){
                    answer += Integer.toString(i);
                    count --;
                }
            }
        }
        return answer;
    }
}