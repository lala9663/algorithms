package baekjoon.level2;

import java.util.Scanner;

public class baek14681 {

        public static void main(String[] args) {
            int x = 0;
            int y = 0;
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            y = sc.nextInt();

            if(x>0 && y>0){
                System.out.println(1);
            } else if (x<0 && y>0) {
                System.out.println(2);
            } else if (x<0 && y<0) {
                System.out.println(3);
            } else if (x>0 && y<0) {
                System.out.println(4);
            }
        }
    }


