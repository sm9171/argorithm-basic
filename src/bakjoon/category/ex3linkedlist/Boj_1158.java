package bakjoon.category.ex3linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}

		System.out.print("<");

		while (!queue.isEmpty()) {
			for (int i = 0; i < K; i++) {
				if (i == K - 1) {
					int a = queue.remove();
					if (queue.isEmpty()) {
						System.out.print(a);
					} else {
						System.out.print(a + ", ");
					}
				} else {
					queue.add(queue.remove());
				}
			}
		}

		System.out.print(">");
	}
}
