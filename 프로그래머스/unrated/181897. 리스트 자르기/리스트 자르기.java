import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = slicer[0];
        int end = slicer[1];

        if (n == 1) {
            return Arrays.copyOfRange(num_list, 0, end + 1);
        } else if (n == 2) {
            return Arrays.copyOfRange(num_list, start, num_list.length);
        } else if (n == 3) {
            return Arrays.copyOfRange(num_list, start, end + 1);
        } else if (n == 4) {
            int step = slicer[2];
            int length = (end - start) / step + 1;
            int[] answer = new int[length];
            int index = 0;
            for (int i = start; i <= end; i += step) {
                answer[index] = num_list[i];
                index++;
            }
            return answer;
        }
        return new int[0]; // 예외 처리를 위해 기본적으로 빈 배열을 반환합니다.
    }
}
