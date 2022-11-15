package programmers.week1.solved;
/*
(1)지문 이해 및 풀이 계획
문제를 두 개의 작은 문제로 나눠서 생각해 보세요
인형을 목표량 만큼 만드는데 총 몇 시간이 필요한가?
특정 시간동만 만들었을 때 지급해야할 인센티브는 얼마인가?
전체 목표량을 만드는데 필요한 시간을 구하기 위해 이분탐색을 사용합니다
숫자의 범위가 int범위를 벗어날 수 있음을 주의하세요
 */
public class Solved6 {
	private long solution(int goal, int[] durations) {
		int maxDuration = 0; // 가장 오래 걸리는 시간
		for (int d : durations) maxDuration = Math.max(maxDuration, d);

		long hours = finishHours(goal, durations, maxDuration);
		return calcPay(hours, durations, maxDuration);
	}

	private long finishHours(int goal, int[] durations, int maxDuration) {
		long min = 0;
		// 최대로 걸리는 시간은 모든 작업자가 가장 오래 걸리는 시간만큼 작업하는 경우
		// 목표량을 작업자 수로 나누면 소수점 버림이 생기니까 1을 더해 넉넉한 최대값을 만들어 줌
		long max = maxDuration * (goal / durations.length + 1L);

		while (min < max) {
			long mid = (min + max) / 2;

			int count = 0;
			for (int d : durations) count += mid / d;

			if (count < goal) min = mid + 1;
			else max = mid;
		}

		return max;
	}

	private long calcPay(long hours, int[] durations, int maxDuration) {
		// 가장 적은 인형의 개수는 작업시간이 가장 오래 걸리는 작업자가 만든 경우
		long minCount = hours / maxDuration;

		long incentive = 0;
		for (int d : durations) {
			incentive += hours / d - minCount;
		}
		return incentive * 10_000L; // 개 당 10,000원;
	}
}
