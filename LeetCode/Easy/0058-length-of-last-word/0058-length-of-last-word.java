    class Solution {
        public int lengthOfLastWord(String s) {
            String[] last = s.split(" ");

            int answer = last[last.length - 1].length();
            return answer;
        }
    }