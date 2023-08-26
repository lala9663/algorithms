import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[][] arr = new long[100001][3];
        arr[1][0] = 1;
        arr[1][1] = 0;
        arr[1][2] = 0;
        arr[2][0] = 0;
        arr[2][1] = 1;
        arr[2][2] = 0;
        arr[3][0] = 1;
        arr[3][1] = 1;
        arr[3][2] = 1;


        long[] sum = new long[100001];
        sum[0] = 0;
        sum[1] = 1;
        sum[2] = 1;
        sum[3] = 3;


        for (int i = 4; i < arr.length; i++) {
            arr[i][0] = (arr[i - 1][1] + arr[i - 1][2])% 1000000009;
            arr[i][1] = (arr[i - 2][0] + arr[i - 2][2])% 1000000009;
            arr[i][2] = (arr[i - 3][0] + arr[i - 3][1])% 1000000009;
        }

        for (int i = 4; i < arr.length; i++) {
            sum[i] = (arr[i][0] + arr[i][1] + arr[i][2])% 1000000009;
        }

        int cnt = Integer.parseInt(br.readLine());

        int[] answer = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            answer[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < cnt; i++) {
            System.out.println(sum[answer[i]]);
        }




    }
}