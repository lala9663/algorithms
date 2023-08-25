import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int[][] arr = new int[41][2];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[2][0] = 1;
        arr[2][1] = 1;

        for (int i = 3; i <= 40; i++) {
            arr[i][0] = arr[i - 1][0] + arr[i - 2][0];
            arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
        }

        int[] answer = new int[cnt];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < cnt; i++) {
            System.out.println(arr[answer[i]][0] + " "+ arr[answer[i]][1]);
        }


    }
}