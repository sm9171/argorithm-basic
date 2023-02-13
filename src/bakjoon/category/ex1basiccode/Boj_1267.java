package bakjoon.category.ex1basiccode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long Y = 0;
        long M = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(st.nextToken());
            Y += ((num / 30) + 1) * 10;
            M += ((num / 60) + 1) * 15;
        }
        if (Y > M) {
            System.out.println("M " + M);
        } else if (Y == M) {
            System.out.println("Y M " + M);
        } else {
            System.out.println("Y " + Y);
        }
    }
}
