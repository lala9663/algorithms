class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int max = 0;
        
        int[] word = new int[100000];

        for (int i = 0; i < strArr.length; i++) {
            word[strArr[i].length()]++;
        }

        for (int i = 0; i < word.length; i++) {
            if (word[i] > max) {
                max = word[i];
            }
        }

        return max;
    }
}