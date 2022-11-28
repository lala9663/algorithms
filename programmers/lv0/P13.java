package programmers.lv0;

import java.util.Arrays;

class P13 {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int x = (array.length / 2);
        answer = array[x];
        return answer;
    }
}