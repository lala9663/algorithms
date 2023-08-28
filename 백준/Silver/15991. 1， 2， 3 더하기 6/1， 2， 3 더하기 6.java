import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] arr = new long[100001];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 2;
        arr[4] = 3;
        arr[5] = 3;
        arr[6] = 6;

        for (int i = 7; i <= 100000; i++) {
            arr[i] = (arr[i - 2] + arr[i - 4] + arr[i - 6]) % 1000000009;
        }

        int cnt = Integer.parseInt(br.readLine());
        int[] answer = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            answer[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < cnt; i++) {
            System.out.println(arr[answer[i]]);
        }
    }
}