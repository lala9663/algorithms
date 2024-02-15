import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < number; i++) {
            String word = sc.next();
            boolean[] visited = new boolean[26]; 
            boolean isGroupWord = true; 

            for (int j = 0; j < word.length() - 1; j++) {
                char current = word.charAt(j); 
                char next = word.charAt(j + 1);

                if (current != next) {
                    if (visited[current - 'a']) {
                        isGroupWord = false;
                        break;
                    }
                    visited[current - 'a'] = true;
                }
            }

            if (!visited[word.charAt(word.length() - 1) - 'a']) {
                visited[word.charAt(word.length() - 1) - 'a'] = true;
            } else {
                isGroupWord = false;
            }

            if (isGroupWord) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
