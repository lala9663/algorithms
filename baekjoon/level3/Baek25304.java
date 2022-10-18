package baekjoon.level3;

import java.util.Scanner;

public class Baek25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int count = sc.nextInt();
        int plus = 0; // get * price 값


        for (int i = 1; i <= count ; i++) {
            int price = sc.nextInt();
            int get = sc.nextInt();
            plus += get*price;
        }
        if(plus == sum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    }
}
