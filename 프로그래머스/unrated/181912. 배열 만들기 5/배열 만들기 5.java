import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
 ArrayList<Integer> arrayList = new ArrayList<>();

    for (int i = 0; i < intStrs.length; i++) {
        String num = "";

        for (int j = 0; j < l; j++) {
            num += intStrs[i].charAt(s + j);
        }
        int count = Integer.parseInt(num);
        if (count > k) {
            arrayList.add(count);
        }
    }

    int[] answer = new int[arrayList.size()];

    for (int i = 0; i < arrayList.size(); i++) {
        answer[i] = arrayList.get(i);
    }

    return answer;
}
}