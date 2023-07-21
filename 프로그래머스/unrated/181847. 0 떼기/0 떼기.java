import java.util.ArrayList;


class Solution {
    public String solution(String n_str) {
        String answer = "";
        String[] arr = n_str.split("");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.remove(i);
                i--;
            } else {
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }


        return answer;
    }
}