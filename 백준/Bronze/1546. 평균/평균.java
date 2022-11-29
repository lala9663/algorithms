import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subject = sc.nextInt();
        int[] arr = new int[subject];
        int max = 0;
        double avg = 0;

        for (int i = 0; i <subject ; i++) {
            int score = sc.nextInt();
            arr[i] = score;
            avg += (double) score * 100;
            if (arr[i]>max){
                max = arr[i];
            }
        }
        avg = avg /(max *arr.length);
        System.out.println(avg);
    }
}

