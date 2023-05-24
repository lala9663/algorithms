import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int countarr[];
    static int result[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());

        countarr = new int[count];
        result = new int[count];

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            countarr[i] = Integer.parseInt(st.nextToken());
        }

        int math[] = new int[44];

        for (int i = 1; i < 44; i++) {
            math[i] = (i * (i + 1)) / 2;
        }


        for (int i = 1; i < 44; i++) {
            for (int j = 1; j < 44; j++) {
                for (int k = 1; k < 44; k++) {
                    int sum = 0;
                    sum += math[i] + math[j] + math[k];
                    matching(sum);
                }
            }
        }

        for (int i = 0; i < countarr.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void matching(int sum) {
        for (int i = 0; i < countarr.length; i++) {

            if (result[i] != 1) {
                if (countarr[i] == sum) {
                    result[i] = 1;
                } else {
                    result[i] = 0;
                }
            }
        }
    }
}