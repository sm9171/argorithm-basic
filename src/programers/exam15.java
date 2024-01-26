package programers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam15 {
	private static class Count{
		public final int zero;
		public final int one;

		public Count(int zero, int one) {
			this.zero = zero;
			this.one = one;
		}

		public Count add(Count count) {
			return new Count(zero + count.zero, one + count.one);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N][N];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		Count count = count(0, 0, N, arr);
		System.out.println(count);
	}
	public static Count count(int offsetX, int offsetY, int size, int[][] arr) {
		int h = size / 2;
		for (int i = offsetX; i < offsetX + size; i++) {
			for (int j = offsetY; j < offsetY + size; j++) {
				if (arr[i][j] != arr[offsetX][offsetY]) {
					return count(offsetX, offsetY, h, arr).add(count(offsetX, offsetY + h, h, arr))
							.add(count(offsetX + h, offsetY, h, arr)).add(count(offsetX + h, offsetY + h, h, arr));
				}
			}
		}

		if (arr[offsetX][offsetY] == 1) {
			return new Count(0, 1);
		}
		return new Count(1, 0);
	}
}
