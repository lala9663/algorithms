package programmers.lv0;

import java.util.HashMap;

public class P08 {
    public long solution(String numbers) {
        long answer = 0;

        numbers = numbers.replaceAll("one","1").replaceAll("two", "2")
                .replaceAll("three","3").replaceAll("four","4").replaceAll("five","5")
                .replaceAll("six","6").replaceAll("seven","7").replaceAll("eight","8")
                .replaceAll("nine","9").replaceAll("zero","0");
        answer = Integer.parseInt(numbers);
        return answer;
    }

//    public long solution2(String numbers){
//        long answer = 0;
//
//        String[] num = {"zero", "one", "two", "three", "four", "five", "six"
//        , "seven", "eight", "nine"};
//
//        for (int i = 0; i <num.length; i++) {
//            numbers = String.valueOf(numbers.split(num[i]));
//        }
//
//        return answer;
//    }


//    으음 해쉬맵 배우셨나요?? 제가 푼다면 해쉬맵에 zero ~ nine까지 해당값을 넣어주고
//전달받은 문자열을 3글자로 해당값 있는지 없으면 -> 4글자 없으면 -> 5글자로 탐색하면거 구할거 같아요
    public long solution3(String numbers){
        long answer = 0;
//        HashMap<String, >


        return answer;

    }

}
