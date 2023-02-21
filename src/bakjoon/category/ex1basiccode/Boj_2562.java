package bakjoon.category.ex1basiccode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int maxNum = 1;
		for (int i = 1; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			if (max < num) {
				max = num;
				maxNum = i;
			}
		}
		System.out.println(max);
		System.out.println(maxNum);
	}
}
