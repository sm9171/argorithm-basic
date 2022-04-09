package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bak_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int count = 1;
        int lt = 1;
        int rt = 1;
        int sum = 1;
        while (rt != N) {
            if (sum == N) {
                count++;
                rt++;
                sum += rt;
            } else if (sum > N) {
                sum -= lt;
                lt++;
            } else {
                rt++;
                sum += rt;
            }
        }
        System.out.println(count);
    }
}
