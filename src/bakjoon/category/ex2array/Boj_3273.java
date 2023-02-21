package bakjoon.category.ex2array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_3273 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int count = 0;
		int left = 0, right = N - 1;
		int comp = Integer.parseInt(br.readLine());

		Arrays.sort(arr);

		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == comp) {    // 같다면 count
				count++;
				left++;
				right--;
			} else if (sum > comp) {    // 더 크다면
				right--;
			} else {    // 더 작다면
				left++;
			}
		}

		System.out.println(count);
	}
}
