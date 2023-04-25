class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a==b && a==c) {
            answer = (a*a*a + b*b*b + c*c*c) * (a*a + b*b + c*c) * (a+b+c);
        }else if(a==c && b==c){
            answer = (a*a*a + b*b*b + c*c*c) * (a*a + b*b + c*c) * (a+b+c);
        }else if(b==c && a==b){
            answer = (a*a*a + b*b*b + c*c*c) * (a*a + b*b + c*c) * (a+b+c);
        }else if(a==b && b!=c){
            answer = (a*a + b*b + c*c) * (a+b+c);
        }else if(a==c && c!=b){
            answer = (a*a + b*b + c*c) * (a+b+c);
        }else if(b==c && a!=b){
            answer = (a*a + b*b + c*c) * (a+b+c);
        }else{
            answer = a+b+c;
        }
        return answer;
    }
}