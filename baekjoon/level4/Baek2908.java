package baekjoon.level4;

import java.util.Scanner;

public class Baek2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
        // toSring 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
        System.out.println(a > b ? a : b);
    }
}
