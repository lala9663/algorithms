import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        String m = br.readLine();
        String a = "";

        for (int i = 0; i < n.length(); i++) {
            a += n.charAt(i);
            a += m.charAt(i);
        }


        while (a.length() > 2) {
            String b = "";
            for (int i = 1; i < a.length(); i++) {
                int sum = Character.getNumericValue(a.charAt(i - 1)) + Character.getNumericValue(a.charAt(i));
                b += Integer.toString(sum % 10);
            }
            a = b;
        }
        System.out.println(a);

    }
}

