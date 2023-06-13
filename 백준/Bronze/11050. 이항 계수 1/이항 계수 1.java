import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.security.Key;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int answer = factorial(N) / (factorial(M) * factorial(N - M));
        System.out.println(answer);
    }

    public static int factorial(int n) {
        int num = 1;
        while (n > 1) {
            num *= n;
            n--;
        }
        return num;
    }
}