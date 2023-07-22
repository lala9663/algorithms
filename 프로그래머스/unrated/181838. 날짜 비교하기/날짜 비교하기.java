class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        String a = "";
        String b = "";
        
        for (int i = 0; i < date1.length; i++) {
            a += date1[i];
        }
        for (int i = 0; i < date2.length; i++) {
            b += date2[i];
        }

        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);

        if (c < d) {
            answer = 1;
        } 
        
        return answer;
    }
}