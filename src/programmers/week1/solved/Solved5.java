package programmers.week1.solved;

import java.util.stream.IntStream;

/*
1. 당면한 문제를 해결한다
2. 좋은코드가 되도록 계속 리팩토링 한다
 */
public class Solved5 {
	private int solution(int[] budgets, int M) {
		int min = 0;
		int max = IntStream.of(budgets).max().orElse(0);

		int answer = 0;
		while (min <= max) {
			final int mid = (min + max) / 2;

			int sum = IntStream.of(budgets)
					.map(b -> Math.min(b, mid))
					.sum();
			if (sum <= M) {
				min = mid + 1;
				answer = mid;
			} else {
				max = mid - 1;
			}
		}
		return answer;
	}
}
