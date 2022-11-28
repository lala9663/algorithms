package programmers.lv0;

import java.util.Scanner;

// 편지
public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message;
    message = sc.nextLine();
    int answer = 0;

        String[] arr = message.split("");

        answer = arr.length*2;

    }

}
