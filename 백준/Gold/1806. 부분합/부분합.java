import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int a[] = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int sum=0;
        int left=0;
        int right=0;
        int answer = Integer.MAX_VALUE;
        int leng =0;
        while(right <= N) {
            if(sum >= S) { 
                sum -= a[left++];
                leng = right - left + 1; 
                if(answer > leng) {
                    answer = leng; 
                }
            }else if(sum < S) {
                sum += a[right++];
            }
        }

        System.out.println((answer) == Integer.MAX_VALUE ? 0 : answer);

    }

}
