import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            String word = sc.next();
            System.out.print(word.charAt(0));
            System.out.println(word.charAt(word.length()-1));
        }

    }
}
