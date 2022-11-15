package programmers.week1.solved;
/*
(1)지문 이해 및 풀이 계획
목적하는 층 수와 10의 보수 만큼의 수로 나눠서 더 적은 수를 찾는 방식으로 접근합니다.
목적하는 층 수 만큼 누를 경우(1) 과
한자리 높은 수를 누르고 10의 보수만큼 누른 경우(2)를 비교해서
두 수 중에 더 작은 작은 값을 취하면 됩니다.
이 때 10의 보수를 취한 경우 한자리 높은 수에 1을 더해줘야 한다는 것을 잊으면 안됩니다.
목적하는 층을 한 자리씩 떼어서 같은 계산을 반복합니다.
 */
public class Solved4 {
	private int solution(int storey) {
		return elevator(storey);
	}

	private int elevator(int floor) {
		if(floor <= 1) return floor;

		int under10 = floor % 10;
		int rest = floor / 10;

		int c1 = under10 + elevator(rest);
		int c2 = (10 - under10) + elevator(rest + 1);
		return Math.min(c1, c2);
	}
}
