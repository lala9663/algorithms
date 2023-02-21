    
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Arrays;
    import java.util.StringTokenizer;
    
    public class Main {
        public static void main(String[] args) throws IOException {
    
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            
            int count = Integer.parseInt(br.readLine());
            int[] num = new int[count];
    
            for (int i = 0; i <count ; i++) {
                num[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(num);
            for (int i = 0; i <count ; i++) {
                sb.append(num[i]).append('\n');
            }
            System.out.println(sb);
        }
    }
    
