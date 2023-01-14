package baekjoon.bronze;

import java.util.Scanner;

public class B1193 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int X = sc.nextInt();
        int n=0;
        int top=1;
        int bot=1;
        int cnt=1;
        if(X==1) {
            System.out.println("1/1");
        }else {
            while(cnt<X){
                n++;
                cnt=n*(n+1)/2; //몇번 째 행인지 찾는 코드
            }
            int num=X-(n-1)*n/2;  //행의 몇번 째 값인지 찾는 코드
            if(n%2==0) {  //짝수 행일 시
                top=num;
                bot=n-num+1;
            }else {
                top=n-num+1;
                bot=num;
            }
            System.out.println(top+"/"+bot);
        }

    }
}