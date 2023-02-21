package bakjoon.category.ex2array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count[] = new int[10];
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		String num = (a * b * c)+"";
		for (int i = 0; i < num.length(); i++) {
			count[Integer.parseInt(String.valueOf(num.charAt(i)))]++;
		}
		for (int i : count) {
			System.out.println(i);
		}
	}
}
