import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            sb.append(solve(br.readLine())).append('\n');
        }

        System.out.println(sb);

    }

    public static String solve(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            char b = s.charAt(i);

            if (b == '(') {
                stack.push(Integer.toString(b));
            } else if (stack.empty()) {
                return "NO";
            } else {
                stack.pop();
            }  
        }

        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        } 
    }
}