class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean a1 = true;
        boolean a2 = true;
        
        if(x1 || x2){
            a1 = true;
        } else {
            a1 = false;
        }
        
        if(x3 || x4){
            a2 = true;
        } else {
            a2 = false;
        }
        
        if(a1 && a2){
            answer = true;
        } else {
            answer = false;
        }
        
        
        return answer;
    }
}