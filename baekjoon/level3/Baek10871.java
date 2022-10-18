package baekjoon.level3;

import java.util.Scanner;

public class Baek10871 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            int num = sc.nextInt();
        if(num<x){
            System.out.println(num);
        }
        }
    }
}
