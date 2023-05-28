class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        String[] word = my_string.split("");
        int num = 0;
        
        for(int i = 0; i < index_list.length; i++){
            num = index_list[i];
            answer += word[num];
        }
        return answer;
    }
}