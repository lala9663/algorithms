package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int c = 0;
        int r = 0;
        for (int i =1; i <= n ; i++) {
            if (n % i == 0) {
                c++;
            }
            if (c == m) {
                r = i;
                break;
            }
        }
        System.out.println(r);
    }
}
