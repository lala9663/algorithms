package baekjoon.level3;

import java.util.Scanner;

public class Baek11021 {
    public static void main(String[] args) {


        int count = 0;
        int num = 0;

        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int plus = a + b;
            num = i;
            System.out.println("Case #" + num + ": " + plus);
        }
        sc.close();
    }
}
