import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int c = 0;

        a = a.replaceAll(b, "1");
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1') {
                c++;
}
        }
        System.out.println(c);
    }
}