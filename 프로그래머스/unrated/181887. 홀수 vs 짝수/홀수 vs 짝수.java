class Solution {
    public int solution(int[] num_list) {
        int sum_odd = 0;  // 홀수 번째 원소들의 합
        int sum_even = 0; // 짝수 번째 원소들의 합
        
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) { // 짝수 번째 원소인 경우
                sum_even += num_list[i];
            } else { // 홀수 번째 원소인 경우
                sum_odd += num_list[i];
            }
        }
        
        // 두 합 중 큰 값을 반환
        if (sum_odd >= sum_even) {
            return sum_odd;
        } else {
            return sum_even;
        }
    }
}
