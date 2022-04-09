package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bak_10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long A[] = new long[N];
        long D[] = new long[N];
        st = new StringTokenizer(br.readLine());
        A[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            A[i] = A[i - 1] + Integer.parseInt(st.nextToken());
        }
        long answer = 0;
        for (int i = 0; i < N; i++) {
            int reminder = (int)A[i] % M;
            if (reminder == 0) {
                answer++;
            }
            D[reminder]++;
        }
        for (int i = 0; i < M; i++) {
            if (D[i] > 1) {
                answer = answer + (D[i] * (D[i] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}
