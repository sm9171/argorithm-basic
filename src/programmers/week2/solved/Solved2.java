package programmers.week2.solved;

import java.util.Arrays;

/*
(1)지문 이해 및 풀이 계획
people, tshirts 배열은 정렬되어 있다는 조건이 없다는 것에 주의하세요
참가자의 상의 사이즈보다 큰 티셔츠는 선택가능하기 때문에 큰 티셔츠 부터 참가자들에게 나눠주는 것으로 설계합니다.
정렬한 배열을 거꾸로 순회합니다.
내림차순으로 정렬을 해도 됩니다.
 */
public class Solved2 {
	private int solution(int[] people, int[] tshirts) {
		Arrays.sort(people);
		Arrays.sort(tshirts);

		int answer = 0;

		int i = tshirts.length - 1;
		for (int j = people.length - 1; j >= 0 && i >= 0; j--) {
			if (tshirts[i] >= people[j]) {
				answer += 1;
				i -= 1;
			}
		}

		return answer;
	}
}
