class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str = Integer.toString(age);
        
        for(int i = 0; i < 5; i++){
            if(str.contains("1")) {
                str = str.replaceAll("1", "b");
            } else if(str.contains("2")) {
                str = str.replaceAll("2", "c");
            } else if(str.contains("3")) {
                str = str.replaceAll("3", "d");
            } else if(str.contains("4")) {
                str = str.replaceAll("4", "e");
            } else if(str.contains("5")) {
                str = str.replaceAll("5", "f");
            } else if(str.contains("6")) {
                str = str.replaceAll("6", "g");
            } else if(str.contains("7")) {
                str = str.replaceAll("7", "h");
            } else if(str.contains("8")) {
                str = str.replaceAll("8", "i");
            } else if(str.contains("9")) {
                str = str.replaceAll("9", "j");
            } else if(str.contains("0")) {
                str = str.replaceAll("0", "a");
            }
        }
        answer = str;
        
        
        return answer;
    }
}