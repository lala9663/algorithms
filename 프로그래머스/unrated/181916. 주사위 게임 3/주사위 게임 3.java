import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        if(a == b && b == c && c == d){
            answer = 1111 * a;
        } else if(a == b && b == c && c != d){
            answer = (10 * a + d) * (10 * a + d);
        } else if(a == b && b != c && b == d){
            answer = (10 * a + c) * (10 * a + c);
        } else if(a != b && a == c && c == d){
            answer = (10 * a + b) * (10 * a + b);
        } else if(a != b && b == c && c== d){
            answer = (10 * b + a) * (10 * b + a);
        } else if(a == b && c == d){
            answer = (a+d) * Math.abs(a-d);
        } else if(a == c && b == d){
            answer = (a +b) * Math.abs(a - b);
        } else if(a == d && b == c){
            answer =  (a + c) * Math.abs(a-c);
        } else if( a == b && a != c && a != d && c!=d) {
            answer = c*d;
        }else if( a == c && a != b && a != d && b!=d) {
            answer = b*d;
        }else if( a == d && a != b && a != c && b!=c) {
            answer = b*c;
        }else if( b == c && b != a && b != d && a!=d) {
            answer = a*d;
        }else if( b == d && b != a && b != c && a!=c) {
            answer = a*c;
        }else if( c == d && c != b && c != a && a!=b) {
            answer = a*b;
        }else{
            int min = 6;
            if(min >= a) min = a;
            if(min >= b) min = b;
            if(min >= c) min = c;
            if(min >= d) min = d;
            answer = min;
        }
        return answer;
    }
}