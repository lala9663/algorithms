import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int[] arr = new int[cnt];
        int coin = 0;


        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i <cnt ; i++) {
            if (arr[cnt - 1 - i] <= money) {
                coin += money / arr[cnt-1 -i];
                money %= arr[cnt - 1 - i];
                if (money <= 0) {
                    break;
                }
            }
        }
        System.out.println(coin);
    }
}
