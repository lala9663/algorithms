class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", "");
        String num[] = my_string.split("");
        
        for(int i = 0; i < num.length; i++){
            
            answer += Integer.parseInt(num[i]);
        }
        
            
        return answer;
    }
}