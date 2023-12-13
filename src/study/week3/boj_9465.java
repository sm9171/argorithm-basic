package study.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_9465 {

	static int[][] stickers;
	static int[][] dp;


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//test case
		int tc = Integer.parseInt(br.readLine());

		// test case만큼 반복
		for (int i = 0; i < tc; i++) {
			// 스티커의 열의 개수
			int n = Integer.parseInt(br.readLine());

			// initialize
			stickers = new int[2][n+1];
			dp = new int[2][n+1];

			// 스티커의 점수 입력
			for(int j=0; j<2; j++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int k = 1; k <= n; k++) {
					stickers[j][k] = Integer.parseInt(st.nextToken());
				}
			}

			// 첫번째 column은 자기 자신이 최대이므로 자기 자신으로 초기화
			dp[0][1] = stickers[0][1];
			dp[1][1] = stickers[1][1];

			// 두번째 column부터는 이전 column의 대각선, 대각선의 한칸 전 중 최대값을 더해준다.
			for (int j = 2; j <= n; j++) {
				dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + stickers[0][j];
				dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + stickers[1][j];
			}

			System.out.println(Math.max(dp[0][n], dp[1][n]));
		}
	}
}
