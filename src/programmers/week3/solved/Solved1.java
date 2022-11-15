package programmers.week3.solved;

import java.util.Arrays;

/*
1. 문제를 풀이한다.
2. 다른 방식으로 풀어본다.
3. 다른 표현으로 바꿔본다.
 */
public class Solved1 {
	private int solution(String[][] clothes) {
		return Arrays.stream(clothes)
				.map(c -> c[1])
				.distinct()
				.map(type -> (int) Arrays.stream(clothes).filter(c -> c[1].equals(type)).count())
				.map(c -> c + 1)
				.reduce(1, (c, n) -> c * n) - 1;
	}
}
