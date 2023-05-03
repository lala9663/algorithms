class Solution {
    public int solution(int a, int b) {
        String b1 = Integer.toString(b); 
        String a1 = Integer.toString(a);
        
        
        int answer1 = Integer.parseInt(a1+b1);
        int answer2 = Integer.parseInt(b1+a1);
        
        if(answer1 >= answer2){
            return answer1;
        } else{
            return answer2;
        }
    }
}