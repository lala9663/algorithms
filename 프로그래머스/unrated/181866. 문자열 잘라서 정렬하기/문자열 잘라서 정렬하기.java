import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public List<String> solution(String myString) {
        List<String> answer = new ArrayList<>();
        myString = myString.replaceAll("x", " ");
        Pattern pattern = Pattern.compile("\\S+");
        Matcher matcher = pattern.matcher(myString);
        while (matcher.find()) {
            answer.add(matcher.group());
        }
        Collections.sort(answer);
        return answer;
    }
}