import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());
        int sum = 0;

        while(a != -1) {
            sb.setLength(0);
            sb.append(a + " = 1");
            sum = 1;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    sum += i;
                    sb.append(" + " + i);
                }
            }
            if(a == sum) {
                System.out.println(sb);
            } else {
                System.out.println((a + " is NOT perfect."));
            }
            a = Integer.parseInt(br.readLine());

        }
    }
}