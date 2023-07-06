import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] word = my_string.split(" ");

        for (int i = 0; i < word.length; i++) {
            if (word[i].isEmpty()) {
                continue;
            } else {
                arrayList.add(word[i]);
            }
        }

        String[] answer = new String[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
