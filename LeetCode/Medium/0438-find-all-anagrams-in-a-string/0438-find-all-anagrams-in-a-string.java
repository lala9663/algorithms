import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length())
            return result;

        int[] target = new int[26];
        for (char c : p.toCharArray())
            target[c - 'a']++;

        int[] count = new int[26];
        for (int i = 0; i < p.length() - 1; i++)
            count[s.charAt(i) - 'a']++;

        for (int i = p.length() - 1; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;

            if (isAnagram(target, count))
                result.add(i - p.length() + 1);

            count[s.charAt(i - p.length() + 1) - 'a']--;
        }

        return result;
    }

    private boolean isAnagram(int[] target, int[] count) {
        for (int i = 0; i < 26; i++) {
            if (target[i] != count[i])
                return false;
        }
        return true;
    }
}
