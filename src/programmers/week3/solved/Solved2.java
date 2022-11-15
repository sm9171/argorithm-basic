package programmers.week3.solved;

import java.util.HashMap;
import java.util.Map;

/*
(1)지문 이해 및 풀이 계획
다른 색의 방울이 나온 인덱스 부터 현재 시점의 인덱스의 차이를 이용해서 방울의 길이를 계산합니다.
방울 값을 1, 2 가 아니라 1, -1 로 변경하면 값의 증감으로 방울의 색이 달라지는 것을 확인할 수 있습니다.
방울 색이 달라지는 인덱스를 저장하기 위해 Map을 활용합니다.
 */
public class Solved2 {
	private int solution(int[] bell) {
		for(int i=0; i<bell.length; i++) {
			// 절대값 측정을 위해 -1로 값 변경
			if(bell[i] == 2) {
				bell[i] = -1;
			}
		}

		int total = bell[0]; // 첫번째 방울의 값
		int answer = 0;

		// <방울의 값들의 합, 현재 누적합이 처음으로 나온 인덱스>
		Map<Integer, Integer> dict = new HashMap<>();
		dict.put(0, -1);
		dict.put(total, 0);

		for(int i=1; i<bell.length; i++) {
			total += bell[i];
			if(!dict.containsKey(total)) {
				// 누적합이 처음 나온 경우, 인덱스를 저장
				dict.put(total, i);
			} else {
				// 처음 방문한 지점의 인덱스부터 현재 인덱스까지 짝이 맞아있음을 의미
				answer = Math.max(answer, i - dict.get(total));
			}
		}

		return answer;
	}
}
