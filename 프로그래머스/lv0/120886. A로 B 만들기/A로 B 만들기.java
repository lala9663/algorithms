import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
       
        char[] before1 = before.toCharArray();
        char[] after1 = after.toCharArray();
        
        Arrays.sort(before1);
        Arrays.sort(after1);

        before = new String(before1);
        after = new String(after1);

        if(before.equals(after)){
            return 1;
        } else {
            return 0;
        }
    }
}