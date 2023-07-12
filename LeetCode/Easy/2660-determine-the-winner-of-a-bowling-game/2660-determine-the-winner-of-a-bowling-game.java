class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int n = player1.length;
        int a = 0;
        int b = 0;

        for(int i=0; i<n; i++) {
            int scoreA = player1[i];
            int scoreB = player2[i];
            if(i == 1) {
                if(player1[0] == 10) {
                    scoreA *= 2;
                }
                if(player2[0] == 10) {
                    scoreB *= 2;
                }
            } else if(i-2 >= 0) {
                if(player1[i-1] == 10 || player1[i-2] == 10) {
                    scoreA *= 2;
                }
                if(player2[i-1] == 10 || player2[i-2] == 10) {
                    scoreB *= 2;
                }
            }
            a += scoreA;
            b += scoreB;
        }
        if(a > b) {
            return 1;
        } else if(b > a) {
            return 2;
        } else {
            return 0;
        }
    }
}