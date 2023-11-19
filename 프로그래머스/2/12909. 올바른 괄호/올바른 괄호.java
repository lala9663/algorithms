   import java.util.*;

class Solution {
        boolean solution(String s) {
            boolean answer = true;


            Stack<String> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ('(')) {
                    stack.push("(");
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
            return  stack.isEmpty();
        }
    }