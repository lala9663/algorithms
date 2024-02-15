import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < cnt; i++) {
            int one = sc.nextInt();
            int two = sc.nextInt();
            sc.nextLine();

            int result = min(one, two);
            System.out.println(result);
        }
    }

    public static int max(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int min(int a, int b) {
        return (a * b) / max(a, b);
    }
}
