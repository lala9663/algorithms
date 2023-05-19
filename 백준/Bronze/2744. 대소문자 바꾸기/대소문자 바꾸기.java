import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] b = a.split("");

        for (int i = 0; i < b.length; i++) {
            if(b[i].matches("[a-z]")) {
                b[i] = b[i].toUpperCase();
            } else {
                b[i] = b[i].toLowerCase();
            }
        }

        String c = String.join("", b);
        System.out.println(c);
    }
}
