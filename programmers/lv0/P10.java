package programmers.lv0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] answer = {1,5,7,9};
//        int[] answer = new int[answerN.length];

        for (int i = 0; i <answer.length ; i++) {
          answer[i] = answer[i] * 2;
        }
        System.out.println(Arrays.toString(answer));
    }


//    class Solution {
//        public int[] solution(int[] numbers) {
//            int[] answerN = {};
//            int[] answer = new int[answerN.length];
//
//            for (int i = 0; i <answerN.length ; i++) {
//                answer[i] = answerN[i] * 2;
//            }
//
//            return answer;
//        }
//    }


    class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int [numbers.length];
            for(int i=0; i<numbers.length; i ++) {
                answer[i] = numbers[i] *2;
            }

            return answer;
        }
    }
}
