import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] num1 = new int[s.length()];
        int[] num2 = new int[t.length()];

        for (int i = 0; i < s.length(); i++) {
            num1[i] = (int) s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            num2[i] = (int) t.charAt(i);
        }

        Arrays.sort(num1);
        Arrays.sort(num2);

        String number1 = Arrays.toString(num1);
        String number2 = Arrays.toString(num2);

        if (number1.equals(number2)) {
            return true;
        } else {
            return false;
        } 
    }
}