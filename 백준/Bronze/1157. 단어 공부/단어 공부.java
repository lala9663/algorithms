import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();    // 문자열 입력받기
        int[] useCounts = new int[26];  // 알파벳 A~Z까지  사용된 횟수를 저장할 배열
        int maxCount = 0;               // 특정 알파벳이 가장 많이 나온 빈도수를 저장한 값
        int moreMax = 0;                // 최대 빈도수를 가진 값이 몇개가 있는지
        char result = '\0';             // 정답을 추출할 문자를 저장할 변수

        word = word.toUpperCase();      // 대문자로 변경하기
        for (int i = 0; i <word.length(); i++) {
            useCounts[word.charAt(i)-'A']++;    //문자열의 i번째 위치의 문자가 사용된 횟수를 1증가시켜 저장한다.
                                                // word.charAt(i)가 'A'라면, 'A'-'A' 연산 -> 아스키코드 65-65가 되어 0이 된다.
                                                // 결국 userCount[0]++; 이 된다.
        }

        for (int i = 0; i <useCounts.length; i++) {     // 초대 빈도수를 구해서 maxCount 변수에 저장
            maxCount = Math.max(maxCount, useCounts[i]);
        }

        for (int i = 0; i <26 ; i++) {
            if ((maxCount == useCounts[i]) && moreMax == 0){
                result = (char)(i+'A');     // 숫자를 다시 대문자 알파벳으로 변환하기
                moreMax++;
            } else if (maxCount == useCounts[i] && moreMax > 0) {
                result = '?';
                break;
            }
        }
        System.out.println(result);
    }
}
