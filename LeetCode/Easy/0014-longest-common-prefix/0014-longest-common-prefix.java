    class Solution {
        public String longestCommonPrefix(String[] strs) {
            
        int length = strs[0].length();
        String answer = "";
            
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < length) {
                length = strs[i].length();
            }
        }
        
        for (int i = 0; i < length; i++) {
            char currentChar = strs[0].charAt(i); 
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return answer; 
                }
            }
            answer += currentChar;
        }

        return answer;
    }
}





