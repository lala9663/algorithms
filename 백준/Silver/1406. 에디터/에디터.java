import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        LinkedList<String> newWord = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            newWord.add(String.valueOf(word.charAt(i)));
        }

        int cnt = Integer.parseInt(br.readLine());
        String[] arr = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            arr[i] = br.readLine();
        }

        ListIterator<String> iterator = newWord.listIterator();

        while (iterator.hasNext()) {
            iterator.next();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == 'L') {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                }
            } else if (arr[i].charAt(0) == 'D') {
                if (iterator.hasNext()) {
                    iterator.next();
                }
            } else if (arr[i].charAt(0) == 'B') {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                    iterator.remove();
                }
            } else if (arr[i].charAt(0) == 'P') {
                iterator.add(String.valueOf(arr[i].charAt(2)));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String str : newWord) {
            sb.append(str);
        }
        System.out.println(sb.toString());
    }
}
