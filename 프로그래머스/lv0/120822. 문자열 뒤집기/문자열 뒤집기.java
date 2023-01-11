import java.util.Stack;

class Solution {
    public String solution(String my_string) {
        
        Stack<Character> stack = new Stack<>();   
        
        
        for(int i = 0; i < my_string.length(); i++){
            stack.push(my_string.charAt(i));
        }
        StringBuilder strb = new StringBuilder();
        while(!stack.empty()){
            strb.append(stack.pop());
        }
        

        return strb.toString();
    }
}