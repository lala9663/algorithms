package programmers.lv0;


import java.util.Scanner;
import java.util.Stack;

public class P12 {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        String reverse = new StringBuilder(numbers).reverse().toString();



        System.out.println(reverse);

//        char[] input = numbers.toCharArray();
//        char[] output = new char[input.length];
//        int startIndex = 0;
//        for (int i = (input.length-1); i >=0 ; i--) {
//            output[startIndex++] = input[i];
//        }
//        reverse = new String(output);
//        System.out.println(reverse);




    }

}
