package baekjoon.level2;

import java.util.Scanner;

public class Baek2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      /*  int hour = 0;
        int min = 0;
        int time = 0;

        hour = sc.nextInt();
        min = sc.nextInt();
        time = sc.nextInt();

        if(min == 0 && time<60){
            System.out.println(hour+ " "+ min);
        }else if (hour == 23 && time <=60){
            hour = 0;
            System.out.println(hour + " " + (min+time-60));
        }else if(time<=60){
            System.out.println(hour+1 + " " + (min+time-60));
        }if (min == 0 && time>60){
            System.out.println((hour+time/60)+" "+(min+time%60));
        } else if ((hour+time/60)>23 && time>60) {
            hour = 0;
            System.out.println((hour+time/60)+ " " +(min+time%60));
        } else if((time>60)) {
            System.out.println((hour+time/60)+ " "+ (min+time%60));
        }*/


                int h = sc.nextInt();
                int m = sc.nextInt();
                int n = sc.nextInt();


                // 모든 시간을 분으로 바꾼다!
                int a = h*60 + m + n;
                h = a/60;
                m = a%60;

                //h가 24를 넘는다면?
                if (h>=24) {
                    h= h-24;
                }

                System.out.println(h + " "+ m);

            }
        }



