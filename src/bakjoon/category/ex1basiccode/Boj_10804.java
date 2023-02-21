package bakjoon.category.ex1basiccode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10804 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[21];
		for (int i = 1; i < 21; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < 10; i++) {
			StringTokenizer tokenizer = new StringTokenizer(br.readLine());
			int a1 = Integer.parseInt(tokenizer.nextToken());
			int a2 = Integer.parseInt(tokenizer.nextToken());

			int mid = (a2 - a1) / 2;

			for (int j = 0; j <= mid; j++) {
				int tmp = arr[a1 + j];
				arr[a1 + j] = arr[a2 - j];
				arr[a2 - j] = tmp;
			}
		}
		for (int i = 1; i < 21; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
