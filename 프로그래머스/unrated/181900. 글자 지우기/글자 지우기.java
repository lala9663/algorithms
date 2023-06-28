import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string, int[] indices) {
        List<String> answer = new ArrayList<>();
        String[] word = my_string.split("");

        for (int index : indices) {
            if (index >= 0 && index < word.length) {
                word[index] = "*";
            }
        }

        for (String character : word) {
            if (!character.equals("*")) {
                answer.add(character);
            }
        }

        return String.join("", answer);
    }
}
