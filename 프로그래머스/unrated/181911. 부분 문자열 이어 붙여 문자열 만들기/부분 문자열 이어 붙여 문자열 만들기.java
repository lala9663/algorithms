class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i <my_strings.length ; i++) {
            int first = parts[i][0];
            int last = parts[i][1];
            for (int j = first; j <= last; j++) {
                answer += my_strings[i].charAt(j);
            }
        }

        return answer;
    }
}