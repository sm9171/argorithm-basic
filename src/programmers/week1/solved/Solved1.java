package programmers.week1.solved;
/*
1. Loop 개선
2. 적절한 데이터 구조 사용
3. 불필요한 오브젝트 제거
 */
public class Solved1 {
	private int solution(int n, int[] stations, int w) {
		int answer = 0;
		int si = 0;
		int position = 1;
		while (position <= n) {
			if (si < stations.length && stations[si] - w <= position) {
				position = stations[si] + w + 1;
				si += 1;
			} else {
				answer += 1;
				position += w * 2 + 1;
			}
		}
		return answer;
	}
}
