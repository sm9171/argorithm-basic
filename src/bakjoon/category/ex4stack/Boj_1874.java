package bakjoon.category.ex4stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int num = 1;
		boolean result = true;
		Stack<Integer> stack = new Stack<>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < N; i++) {
			int su = arr[i];
			if (su >= num) {
				while (su >= num) {
					stack.push(num++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				int n = stack.pop();
				if (su < n) {
					System.out.println("NO");
					result = false;
					break;
				}else{
					sb.append("-\n");
				}
			}
		}
		if(result) System.out.println(sb);
	}
}
