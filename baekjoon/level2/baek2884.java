package baekjoon.level2;

import java.util.Scanner;

public class baek2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if(min<45){
            hour--;  min = min+15;
              if (hour==0){
              hour = 23;
              }
              System.out.println(hour+" "+min);
        }else{
              System.out.println(hour+" "+(min-45));
        }

    }
}
