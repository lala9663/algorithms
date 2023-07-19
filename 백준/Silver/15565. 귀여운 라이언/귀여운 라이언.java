import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = 0;
        int count = 0;
        int answer = -1;

        while (right < N) {
            if (arr[right] == 1) {
                count++;
            }
            right++;

            while (count >= K) {
                if (answer == -1 || answer > right - left) {
                    answer = right - left;
                }
                if (arr[left] == 1) {
                    count--;
                }
                left++;
            }
        }

        System.out.println(answer);
    }

}
