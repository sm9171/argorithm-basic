package bakjoon.category.ex6deck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_1021 {
	public static void main(String[] args) throws IOException {
		LinkedList<Integer> deque = new LinkedList<>();
		int count = 0;	// 2, 3번 연산 횟수 누적 합 변수

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		// 1부터 N까지 덱에 담아둔다.
		for (int i = 1; i <= N; i++) {
			deque.offer(i);
		}

		int[] seq = new int[M];    // 뽑고자 하는 수를 담은 배열

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < M; i++) {
			int target_index = deque.indexOf(seq[i]);
			int half_index;
			if (deque.size() % 2 == 0) {
				half_index = deque.size() / 2 - 1;
			} else {
				half_index = deque.size() / 2;
			}

			if (target_index <= half_index) {
				for(int j = 0; j < target_index; j++) {
					int temp = deque.pollFirst();
					deque.offerLast(temp);
					count++;
				}
			} else {
				for (int j = 0; j < deque.size() - target_index; j++) {
					int temp = deque.pollLast();
					deque.offerFirst(temp);
					count++;
				}
			}
			deque.pollFirst();
		}
		System.out.println(count);
	}
}
