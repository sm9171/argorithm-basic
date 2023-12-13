package study.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1463 {

	static Integer dp[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp = new Integer [N+1];

		dp[0] = 0;
		dp[1] = 0;

		System.out.print(dfs(N));
	}

	static int dfs(int n){
		if (dp[n] == null) {
			if (n % 6 == 0) {
				dp[n] = Math.min(dfs(n - 1), Math.min(dfs(n / 3), dfs(n / 2))) + 1; // 3으로 나누어 떨어지는 경우, 2로 나누어 떨어지는 경우, 1을 빼는 경우를 비교해서 최솟값을 구한다음 최소연산 1을 더한다.
			} else if (n % 3 == 0) {
				dp[n] = Math.min(dfs(n / 3), dfs(n - 1)) + 1; // 3으로 나누어 떨어지는 경우, 1을 빼는 경우
			} else if (n % 2 == 0) {
				dp[n] = Math.min(dfs(n / 2), dfs(n - 1)) + 1; // 2로 나누어 떨어지는 경우, 1을 빼는 경우
			} else {
				dp[n] = dfs(n - 1) + 1; // 1을 빼는 경우
			}
		}

		return dp[n];
	}
}
