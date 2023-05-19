import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        String[] c = a.split(":");
        String[] d = b.split(":");

        int hour1 = Integer.parseInt(c[0]);
        int min1 = Integer.parseInt(c[1]);
        int sec1 = Integer.parseInt(c[2]);

        int hour2 = Integer.parseInt(d[0]);
        int min2 = Integer.parseInt(d[1]);
        int sec2 = Integer.parseInt(d[2]);

        int A = hour1*3600 + min1*60 + sec1;
        int B = hour2*3600 + min2*60 + sec2;
        int C = B - A;

        if (C <= 0) {
            C += 24 * 3600;
        }

        int needHour = C / 3600;
        int needMinute = (C % 3600) / 60;
        int needSecond = C % 60;

        System.out.println(String.format("%02d:%02d:%02d", needHour, needMinute, needSecond));

    }
}
