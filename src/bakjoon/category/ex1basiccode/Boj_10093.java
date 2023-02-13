package bakjoon.category.ex1basiccode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        int count = 0;
        if (a < b) {
            for (long i = a + 1; i < b; i++) {
                count++;
                sb.append(i + " ");
            }
        }
        if (a > b) {
            for (long i = b + 1; i < a; i++) {
                count++;
                sb.append(i + " ");
            }
        }
        System.out.println(count);
        System.out.println(sb);
    }
}
