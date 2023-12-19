package study.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1182 {
	static int[] arr;
	static int count;
	static int N, S;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());

		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dfs(0, 0);
		// S가 0인 경우 공집합도 포함되므로 -1을 해준다.
		System.out.println(S == 0? count-1 : count);
	}

	static void dfs(int idx, int sum) {
		if (idx == N) {
			if (sum == S) {
				count++;
			}
			return;
		}

		dfs(idx + 1, sum);
		dfs(idx + 1, sum + arr[idx]);
	}
}
