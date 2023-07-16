import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());  // 입력 횟수

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int[] arrA = new int[a];
            int[] arrB = new int[b];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a; j++) {
                arrA[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < b; j++) {
                arrB[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arrA);
            Arrays.sort(arrB);

            int count = 0;

            for (int j = 0; j < arrA.length; j++) {
                for (int k = 0; k < arrB.length; k++) {
                    if (arrA[j] > arrB[k]) {
                        count++;
                    }
                }
            }
            sb.append(count + "\n");
        }
        System.out.println(sb);

    }
}
