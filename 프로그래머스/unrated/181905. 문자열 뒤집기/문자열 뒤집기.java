    class Solution {
        public String solution(String my_string, int s, int e) {
            String answer = "";
            String word2 = "";
            String word1 = "";
            String word3 = "";
            
            for(int i = e; i >= s; i--){
                word2 += my_string.charAt(i);
            }
            for (int i = 0; i < s; i++) {
                word1 += my_string.charAt(i);
            }
            for (int i = e+1; i < my_string.length(); i++){
                word3 += my_string.charAt(i);
            }
            
            return answer = word1 + word2 + word3;
        }
    }