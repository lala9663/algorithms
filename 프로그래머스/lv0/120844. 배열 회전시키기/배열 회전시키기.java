class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
            int right = numbers[numbers.length-1];
            int left = numbers[0];
        
        for(int i = 0; i < numbers.length; i++){
            if(direction.equals("right")){
                if(i == 0){
                    answer[i] = right;
                } else {
                    answer[i] = numbers[i-1];
                } 
            } else {
                if(i == numbers.length-1){
                    answer[i] = left;
                } else {
                    answer[i] = numbers[i+1];
                }
            } 
        }
        return answer;
    }
}