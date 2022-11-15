package programmers.week1.solved;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
java 언어를 사용한다 == Java가 제공하는 기본 라이브러리를 사용한다.
기본 라이브러리인 java.lang.* 과 java.util.*의 사용법을 숙지한다.
 */
public class Solved3 {
	private String solution(int[] numbers) {
		String answer = IntStream.of(numbers)
				.mapToObj(String::valueOf)
				.sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
				.collect(Collectors.joining());
		if (answer.startsWith("0")) {
			return "0";
		}
		return answer;
	}
}
