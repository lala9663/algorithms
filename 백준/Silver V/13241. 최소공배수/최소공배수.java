import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long one = sc.nextLong();
        long two = sc.nextLong();

        long result = min(one, two);
        System.out.println(result);
    }



    public static long max(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static long min(long a, long b) {
        return (a * b) / max(a, b);
    }
}
