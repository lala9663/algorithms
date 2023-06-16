import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.security.Key;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
//        int m = (n-2) * 2 + 2;

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

//        for (int i = 0; i < m; i++) {
//            if (queue.size() == 1) {
//                System.out.println(queue.poll());
//                break;
//            } else {
//                if (i % 2 == 0) {
//                    queue.poll();
//                } else {
//                    queue.add(queue.poll());
//                }
//            }
//        }
        int i = 1;
        while (queue.size() > 1) {
            if (i % 2 != 0) {
                queue.poll();
            } else {
                queue.add(queue.poll());
            }
            i++;
        }
        System.out.println(queue.poll());
    }
}