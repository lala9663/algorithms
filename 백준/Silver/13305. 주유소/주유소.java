import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] a = new long[n-1];
        long[] b = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i <n-1 ; i++) {
           a[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i <n ; i++) {
           b[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long min = b[0];

        for (int i = 0; i < n-1; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            sum += (min * a[i]);

        }
        System.out.println(sum);



    }
}
