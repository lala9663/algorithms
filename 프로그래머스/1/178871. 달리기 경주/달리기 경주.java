import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> playerIndices = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playerIndices.put(players[i], i);
        }

        for (String calling : callings) {
            int callingIndex = playerIndices.get(calling);
            if (callingIndex > 0) {

                String temp = players[callingIndex - 1];
                players[callingIndex - 1] = calling;
                players[callingIndex] = temp;
                playerIndices.put(calling, callingIndex - 1);
                playerIndices.put(temp, callingIndex);
            }
        }

        return players;
    }
}
