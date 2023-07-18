import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] C = new int[A+B];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            C[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            C[A + i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(C);

        for (int i : C) {
            sb.append(i + " ");
        }
        System.out.println(sb);
    }
}
