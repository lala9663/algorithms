class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder sb = new StringBuilder();
        int num = 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        for(int i = 0 ; i < pattern.length() ; i++){
            char ch = pattern.charAt(i);
            if(ch == 'I'){
                while(stack.size() != 0){
                    sb.append(stack.pop());
                }
                num += 1;
                stack.push(num);
            }else{
                num += 1;
                stack.push(num);
            }
        }
        while(stack.size() != 0){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}