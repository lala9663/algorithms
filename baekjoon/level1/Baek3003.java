package baekjoon.level1;

import java.util.Scanner;

public class Baek3003 {
    public static void main(String[] args) {
        int king = 1;
        int queen = 1;
        int look = 2;
        int night = 2;
        int bi = 2;
        int pone = 8;


        Scanner sc = new Scanner(System.in);
       king = king - sc.nextInt();
       queen = queen - sc.nextInt();
       look = look - sc.nextInt();
       night = night - sc.nextInt();
       bi = bi - sc.nextInt();
       pone = pone - sc.nextInt();


        System.out.print(king +" ");
        System.out.print(queen+" ");
        System.out.print(look+" ");
        System.out.print(night+" ");
        System.out.print(bi+" ");
        System.out.print(pone);

    }
}
