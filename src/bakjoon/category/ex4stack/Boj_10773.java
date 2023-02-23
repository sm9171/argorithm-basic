package bakjoon.category.ex4stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int sum = 0;
		for (int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				stack.pop();
			} else {
				stack.push(num);
			}
		}
		for (int i : stack) {
			sum += i;
		}
		System.out.println(sum);
	}
}
