import java.util.Arrays;

class Solution {
    public boolean isPalindrome(int x) {
        String[] b = Integer.toString(x).split("");

        String[] reverse = new String[b.length];
        int n = 0;

        if (x<0) {
            return false;
        }
        for (int i = b.length-1; i >= 0 ; i--) {
            reverse[n] = b[i];
            n++;
        }

        for(int i = 0; i < b.length; i++){
            if(!b[i].equals(reverse[i])){
                return false;
            }
        }
        return true;
    }
}