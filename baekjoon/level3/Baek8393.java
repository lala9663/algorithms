package baekjoon.level3;

import java.util.Scanner;

public class Baek8393 {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            sum = sum +i;
        }
        System.out.println(sum);
    }
}
