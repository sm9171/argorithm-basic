package bakjoon.important.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//수 N개가 주어졌을때 i부터 j번째 수까지의 합 구하기
//합 배열을 따로 계산한 다음 구간 합 공식으로 푼다.
//bak_11659
public class problem_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer
                = new StringTokenizer(bf.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] S = new long[suNo + 1];
        stringTokenizer = new StringTokenizer(bf.readLine());
        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }
    }
}
