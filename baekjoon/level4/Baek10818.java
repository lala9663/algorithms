package baekjoon.level4;

import java.util.Arrays;
import java.util.Scanner;

public class Baek10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] inArray = new int[n];

        for (int i = 0; i <n ; i++) {
            inArray[i] = sc.nextInt();
        }

        Arrays.sort(inArray);
        System.out.println(inArray[0]+" "+ inArray[n-1]);
    }
}
