package bakjoon.category.ex1basiccode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            count = 0;
            for (int j = 0; j < 4; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 0) {
                    count++;
                }
            }
            if (count == 1) {
                sb.append("A").append("\n");
            } else if (count == 2) {
                sb.append("B").append("\n");
            } else if (count == 3) {
                sb.append("C").append("\n");
            } else if (count == 4) {
                sb.append("D").append("\n");
            } else {
                sb.append("E").append("\n");
            }
        }
        System.out.println(sb);
    }
}
