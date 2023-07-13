class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        String[] word = myString.split("");
        String change = "";
        for (int i = 0; i <word.length ; i++) {
            if (word[i].equals("A")) {
                word[i] = "B";
            } else {
                word[i] = "A";
            }
        }

        for (int i = 0; i < word.length; i++) {
            change += word[i];
        }

        if (change.contains(pat)) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}