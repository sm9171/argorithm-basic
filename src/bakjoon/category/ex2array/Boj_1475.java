package bakjoon.category.ex2array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int arr[] = new int[10];
		long max = 0;
		for (int i = 0; i < str.length(); i++) {
			char num = str.charAt(i);
			arr[Integer.parseInt(String.valueOf(num))]++;
		}
		arr[6] = ((arr[6] + arr[9]) % 2 == 0) ? (arr[6] + arr[9]) / 2 : (arr[6] + arr[9]) / 2 + 1;
		arr[9] = 0;
		for (long i : arr) {
			if (max < i) {
				max = i;
			}
		}
		System.out.println(max);
	}
}
