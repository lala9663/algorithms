class Solution {
    public int solution(String num_str) {
        int answer = 0;

        String[] arr = num_str.split("");
        int[] num = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        
        for(int i = 0; i < num.length; i++){
            answer += num[i];
        }

        return answer;
    }
}
