class Solution {
       
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n]; 
                
        for(int i =0;i<n;i++){
            String sharp = Integer.toBinaryString(arr1[i] | arr2[i]);
            sharp = String.format("%"+n+"s",sharp);
            sharp = sharp.replaceAll("1" , "#");
            sharp = sharp.replaceAll("0" , " ");
            answer[i] = sharp;
        }
        
        return answer;
    }
}