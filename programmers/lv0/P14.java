package programmers.lv0;

// 세균 증식
public class P14 {
    class Solution {
        public int solution(int n, int t) {
            int answer = 0;

            double result = Math.pow(2, t);
            answer = n * (int)result;

            return answer;
        }
    }
}
