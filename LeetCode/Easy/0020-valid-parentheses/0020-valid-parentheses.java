import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false; // 괄호 개수가 홀수일 경우 무조건 유효하지 않음
        }
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);
            
            if (word == '(' || word == '{' || word == '[') {
                stack.push(word);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                
                if (word == ')' && top != '(') {
                    return false;
                }
                
                if (word == '}' && top != '{') {
                    return false;
                }
                
                if (word == ']' && top != '[') {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
