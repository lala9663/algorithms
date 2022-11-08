package programmers.lv0;
// 각도기
public class P06 {
    public int solution(int angle) {
        int answer=0;
        if(angle>0 && angle < 90) {
            answer = 1;
        } else if(angle == 90) {
            answer = 2;
        } else if(angle < 180) {
            answer = 3;
        } else if(angle == 180) {
            answer = 4;
        }
        return answer;
    }
}
