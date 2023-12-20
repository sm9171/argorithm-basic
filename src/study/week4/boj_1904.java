package study.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1904 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long d[] = new long[N+1];
		d[0] = 0;
		d[1] = 1;
		d[2] = 2;
		for (int i = 3; i <= N; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		System.out.println(d[N] % 15746);
	}
}
