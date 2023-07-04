    class Solution {
        public int solution(String myString, String pat) {
            int answer = 0;
            String low1 = myString.toLowerCase();
            String low2 = pat.toLowerCase();

            if (low1.contains(low2)) answer = 1;
            else answer = 0;

            return answer;
        }
    }