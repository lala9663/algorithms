package baekjoon.level3;

import java.util.Scanner;

public class Baek10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int i = sc.nextInt();

        for ( int j = 0; j <i ; j++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
