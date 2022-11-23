package programmers.lv0;
//아이스아메리카노
public class P24 {
    public int[] solution(int money) {
        int count = money / 5500 ;
        int rest = money % 5500;
        int[] answer = {count, rest};

        return answer;
    }
}

