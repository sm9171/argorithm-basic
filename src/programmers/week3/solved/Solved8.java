package programmers.week3.solved;

/*
(1)지문 이해 및 풀이 계획
회문(palindrome)을 찾는 문제의 응용으로 접근할 수 있습니다.
각 사탕과 같은 색이 이전에 몇 번 반복됐었는지를 찾아 인덱싱 합니다.
인덱싱 정보를 바탕으로 이전에 반복됐던 사탕의 개수를 카운트 합니다.
 */
public class Solved8 {
	private int[] solution(String candy, int[] positions) {
		int i = 0; // 기준 사탕 인덱스
		int[] backwardIndices = new int[candy.length()];
		for (int j = 1; j < candy.length(); j++) {
			final char ch = candy.charAt(j); // 현재 사탕

			// 현재 사탕이 기준 사탕과 다르면 같은 사탕이 나올 때 까지 이전으로 거슬러 올라감
			while (i > 0 && ch != candy.charAt(i)) {
				i = backwardIndices[i];
			}

			// 현재 사탕이 기준 사탕과 같으면 기준 사탕을 다음으로 옮김
			if (ch == candy.charAt(i)) i += 1;
			backwardIndices[j] = i;
		}

		int[] answer = new int[positions.length];
		for (int j = 0; j < positions.length; j++) {
			int count = 0;
			int k = positions[j] - 1; // 인덱스로 만들기

			// k 번째에서 잘랐을 때 반복되는 사탕의 개수 구하기
			while (backwardIndices[k] > 0) {
				k = backwardIndices[k] - 1; // 인덱스로 만들기
				if (k < 0) break;
				count++;
			}

			answer[j] = count;
		}

		return answer;
	}
}
