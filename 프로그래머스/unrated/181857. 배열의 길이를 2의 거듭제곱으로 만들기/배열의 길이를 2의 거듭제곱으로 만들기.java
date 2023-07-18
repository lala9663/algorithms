import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int newSize = 1;
        
        // 새로운 배열의 크기 결정
        while (newSize < length) {
            newSize *= 2;
        }
        
        // 0을 추가하여 새로운 배열 생성
        int[] newArr = new int[newSize];
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        
        return newArr;
    }
}
