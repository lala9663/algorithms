import java.util.*;

    class Solution {
        public int solution(int[][] dots) {
            int answer = 0;

            int a = 0;
            int b = 0;

            for (int i = 0; i < dots.length; i++) {
                for (int j = i+1; j < dots.length; j++) {
                    if (dots[i][0] == dots[j][0]) {
                        b = Math.abs(dots[i][1] - dots[j][1]);
                    }
                    if (dots[i][1] == dots[j][1]) {
                        a = Math.abs(dots[i][0] - dots[j][0]);
                    }
                }
            }

            answer = a* b;

            return answer;
        }
    }