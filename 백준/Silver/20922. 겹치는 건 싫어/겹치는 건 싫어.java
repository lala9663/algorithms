import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = getLongestSubarrayLength(arr, K);
        System.out.println(answer);
    }

    private static int getLongestSubarrayLength(int[] arr, int K) {
        int answer = 0;
        int start = 0;
        int[] count = new int[200001]; // 숫자 범위에 따라 배열 크기 조정

        for (int end = 0; end < arr.length; end++) {
            count[arr[end]]++;

            while (count[arr[end]] > K) {
                count[arr[start]]--;
                start++;
            }

            int length = end - start + 1;
            answer = Math.max(answer, length);
        }

        return answer;
    }
}
