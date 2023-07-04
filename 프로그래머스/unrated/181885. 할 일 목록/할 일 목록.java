import java.util.ArrayList;
    

class Solution {
        public String[] solution(String[] todo_list, boolean[] finished) {
            ArrayList<String> array = new ArrayList<>();

            for(int i = 0; i < todo_list.length; i++) {
                if(finished[i]) continue;
                if(!finished[i]) array.add(todo_list[i]);
            }
            String[] answer = new String[array.size()];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = array.get(i);
            }

            return answer;
        }
    }