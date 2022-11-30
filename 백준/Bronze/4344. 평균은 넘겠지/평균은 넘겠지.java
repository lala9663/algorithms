import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int j=0; j < testCase; j++) {
            int students = 0;
            int score = 0;

            int sum = 0;
            double agv = 0;
            int overStu = 0;
            double answer=0;

            students = sc.nextInt();
            int[] scores = new int[students];
            for (int i = 0; i < students; i++) {
                score = sc.nextInt();
                scores[i] = score;
                sum += scores[i];
            }
            agv = (double) sum / students;
            for (int i = 0; i < students; i++) {
                if (scores[i] > agv) {
                    overStu += 1;
                }
            }
            answer = 100 * overStu / (double)students;
            System.out.println(String.format("%.3f", answer)+ "%");
        }


    }
}