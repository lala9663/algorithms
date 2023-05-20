import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        char[][] length = new char[c][d];

        for (int i = 0; i <c ; i++) {
            length[i] = br.readLine().toCharArray();
        }

        boolean[] rowExist = new boolean[c];
        boolean[] colExist = new boolean[d];
        for (int i = 0; i < c; i++)
            for (int j = 0; j < d; j++)
                if (length[i][j] == 'X') {
                    rowExist[i] = true;
                    colExist[j] = true;
                }

        int rowNeedCount = c;
        int colNeedCount = d;
        for (int i = 0; i < c; i++)
            if (rowExist[i]) rowNeedCount--;
        for (int i = 0; i < d; i++)
            if (colExist[i]) colNeedCount--;

        System.out.println(Math.max(rowNeedCount, colNeedCount));
    }
}