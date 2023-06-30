import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        String[] num = s.split(" ");
        
        for(int i = 0; i < num.length; i++) {
            if(!num[i].equals("Z")){
                stack.push(Integer.parseInt(num[i]));
            } else {
                if(stack.size() >= 1) {
                    stack.pop();
                }
            }
        }
        
        while(stack.size() != 0) {
            answer += stack.pop();
        }
        return answer;
    }
}