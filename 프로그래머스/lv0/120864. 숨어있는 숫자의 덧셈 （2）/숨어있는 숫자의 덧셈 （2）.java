import java.util.regex.*;

class Solution {
    public int solution(String my_string) {
        // 문자열에서 숫자를 추출하여 배열에 저장
        String[] numbers = my_string.split("[^0-9]+");

        int sum = 0;
        for (String number : numbers) {
            if (!number.isEmpty()) {
                // 추출한 숫자를 정수로 변환하여 합산
                sum += Integer.parseInt(number);
            }
        }

        return sum;
    }
}
