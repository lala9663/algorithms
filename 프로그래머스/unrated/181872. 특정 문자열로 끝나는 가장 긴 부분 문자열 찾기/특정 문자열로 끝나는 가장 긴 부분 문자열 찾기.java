import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String myString, String pat) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < myString.length(); i++) {
            String curStr = myString.substring(0, i + 1);
            if (curStr.endsWith(pat)) {
                result.add(curStr);
            }
        }

        Collections.sort(result, (a, b) -> b.length() - a.length());

        if (!result.isEmpty()) {
            return result.get(0);
        } else {
            return "";
        }
    }
}
