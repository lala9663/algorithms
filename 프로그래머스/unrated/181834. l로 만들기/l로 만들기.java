class Solution {
    public String solution(String myString) {
        String answer = "";

        char[] arr = myString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 'l') {
                arr[i] = 'l';
            }
        }

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}