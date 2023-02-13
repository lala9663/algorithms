import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] m = new int[5];
        int sum = 0;
        int avg = 0;

        for (int i = 0; i <5 ; i++) {
            m[i] = Integer.parseInt(br.readLine());
            sum += m[i];
        }
        Arrays.sort(m);
        avg = sum / 5;

        System.out.println(avg);
        System.out.println(m[2]);


    }
}