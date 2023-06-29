class Solution {
    public int[] solution(int[] arr) {
            int a = 0;
            int b = 0;

            for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 2) {
            a = i;
            break;
        }
    }
    for (int i = arr.length - 1; i >= 0; i--) {
        if (arr[i] == 2) {
            b = i;
            break;
        }
    }

    int[] answer;
        if (a == 0 && b == 0) {
        answer = new int[1];
        answer[0] = -1;
        } else if (a == b) {
        answer = new int[1];
        answer[0] = 2;
        } else {
        answer = new int[b - a + 1];
        for (int i = a; i <= b; i++) {
            answer[i - a] = arr[i];
        }
    }

    return answer;
}
}