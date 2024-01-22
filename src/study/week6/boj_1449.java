package study.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1449 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		int[] leak = new int[N];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			leak[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(leak);

		int tape = 0;
		int count = 0;
		for (int i = 0; i < N; i++) {
			int position = leak[i];
			if (position > tape) {
				tape = position + R - 1;
				count++;
			}
		}
		System.out.println(count);
	}
}
