import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        
        int[] a = new int[progresses.length];  
        int[] b = new int[progresses.length];  
        int day = 0;
        
        for (int i = 0; i < progresses.length; i++) {
    a[i] = progresses[i];
    
    if ((100 - a[i]) % speeds[i] == 0) {
        b[i] = (100 - a[i]) / speeds[i];
    } else {
        b[i] = (100 - a[i]) / speeds[i] + 1;
    }
}
        
        int count = 0; 
        int currentDay = b[0]; 
        
        for (int i = 0; i < progresses.length; i++) {
            if (b[i] <= currentDay) {
                count++;
            } else {
                result.add(count); 
                count = 1;
                currentDay = b[i]; 
            }
        }
        
        result.add(count);
        
        int[] answer = new int[result.size()];
        
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}
