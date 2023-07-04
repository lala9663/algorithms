import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int y= 0;
        int ar = array.length;
        Arrays.sort(array);
        if(array[ar-1]<=n){ return array[ar-1]; }
         else if (array[0]>=n){ return array[0];}
        for(int i = 0;i<ar-1;i++){
            if(array[i]<=n && array[i+1]>=n){
                if(Math.abs(array[i]-n) <=  Math.abs(array[i+1]-n)){return array[i];}
                else{return array[i+1];}
            }
        }
        return y;
    }
}