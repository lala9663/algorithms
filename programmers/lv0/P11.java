package programmers.lv0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P11 {
        public int[] solution(int n) {
            int[] answer;
            int k = 0;

            // 먼저 배열의 방을 만든다.
            if(n%2 == 0){
                answer = new int[n/2];
            } else {
                answer = new int[n/2 +1];
            }

            for (int i = 0; i <= n; i++) {
                if (i % 2 != 0){
                    answer[k] = i;
                    k++;
                }
            }

            return answer;
        }

}
