import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                array.add(arr[i]);
            }
        }

        int[] answer = new int[array.size()];
        
        for (int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        
        
        return answer;
    }
}