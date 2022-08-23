package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//bak_10986
public class solved_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        long count = 0;
        long S[] = new long[N];
        long C[] = new long[M];
        S[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            int remainder = (int) (S[i] % M);

            if (remainder == 0) {
                count++;
            }
            C[remainder]++;
        }
        for (int i = 0; i < M; i++) {
            if (C[i] > 0) {
                count = (count + (C[i] * (C[i] - 1) / 2));
            }
        }
        System.out.println(count);
    }
}
