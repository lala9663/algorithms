import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s;

        while (true) {
            s = br.readLine();
            if (s.equals(("."))) {
                break;
            }
            sb.append(solve(s)).append('\n');
        }

        System.out.println(sb);
    }

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            if (b == '(' || b == '[') {
                stack.push(b);
            } else if (b == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (b == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                } 
            } 
            
        }

        if (stack.empty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}