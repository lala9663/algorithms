import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        int num = 1;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            while (num <= target) {
                stack.push(num);
                sb.append("+\n");
                num++;
            }

            if (stack.isEmpty() || stack.peek() != target) {
                possible = false;
                break;
            }

            stack.pop();
            sb.append("-\n");
        }

        if (possible) {
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}
