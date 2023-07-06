import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        System.out.print("<");

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                if (j != K) {
                    queue.add(queue.poll());
                } else {
                    System.out.print(queue.poll());
                }
            }
            if (!queue.isEmpty()) {
                System.out.print(", ");
            }
        }

        System.out.print(">");



    }
}