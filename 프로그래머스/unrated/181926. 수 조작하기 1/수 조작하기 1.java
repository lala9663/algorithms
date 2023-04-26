class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String w = "1";
        String s = "-1";
        String d = "10";
        String a = "-10";
        
        String[] arr = control.split("");
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals("w")){
                arr[i] = "1";
            }else if(arr[i].equals("s")){
                arr[i] = "-1";
            }else if(arr[i].equals("d")){
                arr[i] = "10";
            }else if(arr[i].equals("a")){
                arr[i] = "-10";
            }
        }   
        int[] newArr = new int[arr.length];
        
         for (int i = 0; i < arr.length; i++) {
            newArr[i] = Integer.parseInt(arr[i]);
            answer += newArr[i];
        }
        return n+answer;
    }
}