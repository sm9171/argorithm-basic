package programmers.week1.solved;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
(1)지문 이해 및 풀이 계획
동전의 앞 위를 0과 1로 표현하기 때문에 뒤집는 것은 0과 1을 toggle하면 됩니다.
0과 1을 toggle하는 방법은 1 - x 하면 됩니다.
모두 0으로 만들기 위해 뒤집기를 하는 경우와 1을 만들기 위해 뒤집기를 하는 경우를 구해서 더 적은 값을 선택합니다.
flipCoin 메소드 내에서 coin 배열의 값을 변경하기 때문에 복사본을 넘겨야 합니다.
배열이 파라미터로 전달될 때 레퍼런스값이 전달되기 때문에 배열의 요소를 변경하면 원본값도 변하게 되기 때문입니다.
 */
public class Solved8 {
	private int solution(int[] coin, int k) {
		// 동전이 하나면 뒤집을 필요 없음
		if (coin.length == 1) return 0;

		int sum = IntStream.of(coin).sum();
		// 모두 0이면 sum은 0, 모두 1일 때 sum은 coin.length
		if (sum == 0 || sum == coin.length) return 0; // 뒤집을 필요 없음
		if (sum != k && coin.length == k) return -1; // 불가

		// flipCoins 로 전달되는 배열의 내용이 변경되기 때문에 Arrays.copyOf 로 배열의 복사본을 전달합니다.
		int makeAll0 = flipCoins(Arrays.copyOf(coin, coin.length), k, 0); // 모두 0으로 만들 경우
		int makeAll1 = flipCoins(Arrays.copyOf(coin, coin.length), k, 1); // 모두 1로 만들 경우
		int answer = Math.min(makeAll0, makeAll1);
		if (answer == Integer.MAX_VALUE) return -1;
		return answer;
	}

	int flipCoins(int[] coin, int k, int t) {
		int ret = 0;

		for (int i = 0; i < coin.length - k + 1; i++) {
			if (coin[i] == t) continue; // 이미 원하는 값인 경우 스킵

			for (int j = 0; j < k; j++) {
				coin[i + j] = 1 - coin[i + j]; // 뒤집기 : 0 -> 1, 1 -> 0
			}

			ret += 1; // 뒤집은 횟수
		}

		int count = 0;
		for (int c : coin) if (c == t) count += 1; // 원하는 값의 개수 세기

		if (count == coin.length) return ret;
		return Integer.MAX_VALUE;
	}
}
