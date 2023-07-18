import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int[] pFreq = new int[26]; // 알파벳 빈도수 배열

        // p 문자열의 각 문자에 대한 빈도수 계산
        for (char ch : p.toCharArray()) {
            pFreq[ch - 'a']++;
        }

        int left = 0;
        int right = 0;
        int[] sFreq = new int[26]; // s 문자열의 현재 윈도우 내 빈도수 배열

        while (right < s.length()) {
            // 현재 문자 빈도수 증가
            sFreq[s.charAt(right) - 'a']++;

            // 윈도우 크기가 p 문자열과 동일할 때
            if (right - left + 1 == p.length()) {
                // 애너그램 여부 확인
                if (Arrays.equals(sFreq, pFreq)) {
                    result.add(left);
                }
                // 왼쪽 문자 빈도수 감소
                sFreq[s.charAt(left) - 'a']--;
                left++;
            }

            right++;
        }

        return result;
    }
}
