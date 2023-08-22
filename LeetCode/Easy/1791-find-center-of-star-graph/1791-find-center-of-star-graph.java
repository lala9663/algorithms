class Solution {
        public int findCenter(int[][] edges) {
            
            int a = edges[0][0];
            int b = edges[0][1];
            int answer = 0;

            if (a == edges[1][0] || a == edges[1][1]) {
                answer = a;
            }
            if (b == edges[1][0] || b == edges[1][1]) {
                answer = b;
            }
            return answer;
        }
    }