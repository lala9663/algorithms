import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<>(); // 반복문 밖에서 스택 선언

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            boolean isValid = true;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            stack.clear(); // 반복문 종료 후 스택 초기화
        }
    }
}
