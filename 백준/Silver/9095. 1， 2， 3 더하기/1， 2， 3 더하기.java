import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[11];
        for (int i = 1; i < arr.length; i++) {
            if (i == 1 || i == 2) {
                arr[i] = i;
            } else if (i == 3) {
                arr[i] = 4;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
        }

        int[] arr2 = new int[N];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            System.out.println(arr[arr2[i]]);
        }


    }
}