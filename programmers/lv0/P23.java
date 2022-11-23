package programmers.lv0;

// 피자 나눠먹기 3
public class P23 {
    public int solution(int slice, int n) {
        int answer = 0;

        if(n >= slice && n % slice == 0){
            answer = n / slice;
        } else if(n < slice && slice % n == 0){
            answer = slice / n ;
        } else{
            answer = n/slice +1;
        }
        return answer;
    }
}

