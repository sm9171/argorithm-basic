package bakjoon.category.ex1basiccode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2446 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = N; i > 0; i--) {
			for (int j = 0; j <= N - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < N; i++) {
			for (int j = 0; j <= N - i - 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2*i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
