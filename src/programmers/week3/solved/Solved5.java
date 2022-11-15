package programmers.week3.solved;

import java.util.LinkedList;
import java.util.Queue;
/*
너비우선탐색(BFS), 깊이우선탐색(DFS)
- 비선형 데이터를 순회하는 방법
- 순서가 다르다
- 순서를 무시하면 결과는 동일하다
 */
public class Solved5 {
	class P {
		int open, close;

		public P(int open, int close) {
			this.open = open;
			this.close = close;
		}
	}

	private int solution(int n) {
		int answer = 0;
		Queue<P> stack = new LinkedList<>();
		stack.offer(new P(0, 0));
		while (!stack.isEmpty()) {
			P p = stack.poll();
			if (p.open > n) {
				continue;
			}
			if (p.open < p.close) {
				continue;
			}
			if (p.open + p.close == 2 * n) {
				answer++;
				continue;
			}
			stack.offer(new P(p.open + 1, p.close));
			stack.offer(new P(p.open, p.close + 1));
		}

		return answer;
	}
}
