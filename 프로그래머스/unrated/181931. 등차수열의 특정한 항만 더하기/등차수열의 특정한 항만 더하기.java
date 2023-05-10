class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] c = new int[included.length];
        boolean target = true;
        int index = -1;
        
        for(int i = 0; i < included.length; i++){
           c[i] = a + i * d;  
        }
        
        for(int i = 0; i < included.length; i++){
            if(included[i] == target){
                index = i;
                answer += c[i];
            }
        }
        
        return answer;
    }
}