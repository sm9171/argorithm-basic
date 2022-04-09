package bakjoon;

import java.util.Scanner;

public class bak_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			sum += arr[i];
		}
		System.out.println(sum * 100.0 / max / N);
	}
}
