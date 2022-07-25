package solved.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bak_1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int arrA[] = new int[N];

		for (int i = 0; i < N; i++) {
			arrA[i] = Integer.parseInt(st.nextToken());
		}

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		int arrB[] = new int[M];

		for (int i = 0; i < M; i++) {
			arrB[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < arrB.length; i++) {
			int result = 0;

			for (int j = 0; j < arrA.length; j++) {
				if (arrB[i] == arrA[j]) {
					result = 1;
				}
			}
			System.out.println(result);
		}
		br.close();
	}
}
