package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bak_1253 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		long arr[] = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		int result = 0;
		Arrays.sort(arr);
		for (int i = 0; i < N; i++) {
			long find = arr[i];
			int lt = 0;
			int rt = N - 1;
			while (lt < rt) {
				if (arr[lt] + arr[rt] == find) {
					if (lt != i && rt != i) {
						result++;
						break;
					} else if (lt == i) {
						lt++;
					} else if (rt == i) {
						rt--;
					}
				} else if (arr[lt] + arr[rt] < find) {
					lt++;
				} else {
					rt--;

				}
			}
		}
		System.out.println(result);
		bf.close();
	}
}
