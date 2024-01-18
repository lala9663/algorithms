class Solution {
    public String solution(String s, int n) {
       StringBuilder result = new StringBuilder();

            for (char ch : s.toCharArray()) {
                if (Character.isLetter(ch)) {
                    char base = Character.isLowerCase(ch) ? 'a' : 'A';
                    int shifted = (ch - base + n) % 26;
                    result.append((char) (base + shifted));
                } else {
                    result.append(ch);
                }
            }

            return result.toString();
        }
    
}