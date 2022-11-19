package baekjoon.bronze;

import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] number = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()
                , sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()
                , sc.nextInt()};
        sc.close();

        int count = 0;
        int max = 0;
        int index = 0;

        for (int value : number){
            count+;

            if (value > max){
                max = value;
                index = count;
            }
        }
        System.out.println(max + "\n" + index);
    }
}
