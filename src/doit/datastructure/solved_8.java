package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//bak_1253
public class solved_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long arr[] = new long[N];
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            long find = arr[i];
            int lt = 0;
            int rt = N - 1;

            while (lt < rt) {
                if (arr[lt] + arr[rt] == find) {
                    if (lt != i && rt != i) {
                        result++;
                        break;
                    } else if (lt == i) {
                        lt++;
                    } else if (rt == i) {
                        rt--;
                    }
                } else if (arr[lt] + arr[rt] < find) {
                    lt++;
                } else {
                    rt--;
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}
