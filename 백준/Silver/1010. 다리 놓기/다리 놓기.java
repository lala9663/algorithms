import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
    static int[][] dp = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(bridge(M, N)).append('\n');
        }
        System.out.println(sb);
    }

    public static int bridge(int n, int m) {
        if (dp[n][m] > 0) {
            return dp[n][m];
        }
        if (n == m || m == 0) {
            return dp[n][m] = 1;
        }
        return dp[n][m] = bridge(n - 1, m - 1) + bridge(n - 1, m);
    }
}