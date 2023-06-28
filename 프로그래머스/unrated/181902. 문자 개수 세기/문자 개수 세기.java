class Solution {
    public int[] solution(String my_string) {

        int count = 1;

            char[] blank = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            int[] answer = new int[blank.length];

            for (int i = 0; i < my_string.length(); i++) {
                for (int j = 0; j < blank.length; j++) {
                    if (my_string.charAt(i) == blank[j]) {
                        answer[j] += count;
                    }
                }
            }

                return answer;
    }
}