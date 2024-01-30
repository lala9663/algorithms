class Solution {
    public int solution(String s) {
        int answer = 0;
        while (!s.isEmpty()) {
            int same = 0;
            int diff = 0;
            char x = s.charAt(0);
            int i = 0;
            
            while (i < s.length() && (same == 0 || same != diff)) {
                if (s.charAt(i) == x) {
                    same++;
                } else {
                    diff++;
                }
                i++;
            }
            
            s = s.substring(i);
            answer++;
        }
        return answer;
    }
}
 