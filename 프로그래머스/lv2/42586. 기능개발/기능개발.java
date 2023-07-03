import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>(); // 배포별 개수를 저장할 동적 배열
        
        int[] a = new int[progresses.length];  // 남은 작업 %
        int[] b = new int[progresses.length];  // 작업량을 day로 바꾼 것
        int day = 0;
        
        for (int i = 0; i < progresses.length; i++) {
    a[i] = progresses[i];
    
    if ((100 - a[i]) % speeds[i] == 0) {
        b[i] = (100 - a[i]) / speeds[i];
    } else {
        b[i] = (100 - a[i]) / speeds[i] + 1;
    }
}
        
        int count = 0; // 현재 배포별 기능 개수 카운트
        int currentDay = b[0]; // 현재 배포 일수
        
        for (int i = 0; i < progresses.length; i++) {
            if (b[i] <= currentDay) {
                count++;
            } else {
                result.add(count); // 배포별 기능 개수 저장
                count = 1; // 새로운 배포일에 첫 번째 기능 개수로 초기화
                currentDay = b[i]; // 배포 일수 갱신
            }
        }
        
        result.add(count); // 마지막 배포에 대한 기능 개수 저장
        
        int[] answer = new int[result.size()];
        
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
