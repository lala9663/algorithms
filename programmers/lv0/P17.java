package programmers.lv0;

import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int k = sc.nextInt();
        int answer = 0;

        String count = Integer.toString(num);
        String[] max = count.split("");

        for (int i = 0; i <max.length ; i++) {
            if (k == Integer.parseInt(max[i])){
                answer = i+1;

            }
            System.out.println(answer);
        }

    }
}
