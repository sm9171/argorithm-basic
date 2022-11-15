package programmers.week3.solved;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
(1)지문 이해 및 풀이 계획
List<List<Integer>> 를 사용해서 문제를 풀이할 수도 있지만, Citizen 같은 클래스를 만들어서 풀이하면 코드의 가독성과 이해를 높일 수 있습니다.
주민번호는 1부터 시작하지만 index로 사용할 때는 0 부터 시작한다는 것을 주의하세요.
k번 방문하는 BFS를 알고리즘을 적용하여 풀이할 수 있습니다.
다음 루프의 대상이 되는 (Queue에 등록되는) 조건은 대상이 k번 이상 되어야 합니다.
visited 여부는 편지를 k번 받은 여부로 결정합니다
 */
// 주민 클래스
class Citizen {
	final boolean isBadBoy;
	final List<Integer> contacts = new ArrayList<>();
	int received = 0;

	public Citizen(boolean isBadBoy) {
		this.isBadBoy = isBadBoy;
	}
}

public class Solved4 {
	private int solution(int n, int c, int k, int[][] contact) {
		List<Citizen> citizens = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			citizens.add(new Citizen(i < c)); // i < c 이면 악동클럽
		}

		for (int[] cont : contact) {
			// 주민 번호를 index로 처리하기 위해 -1 을 해줍니다
			citizens.get(cont[0] - 1).contacts.add(cont[1] - 1);
		}

		Queue<Citizen> queue = new LinkedList<>();
		for (Citizen citizen : citizens) {
			if (citizen.isBadBoy) queue.offer(citizen);
		}

		while (!queue.isEmpty()) {
			Citizen cur = queue.poll();

			// 연락처에 있는 주민들을 대상으로 수행
			for (int i : cur.contacts) {
				Citizen receiver = citizens.get(i);
				if (receiver.received == k) continue; // k 만큼 받은사람은 패스

				receiver.received += 1;
				if (receiver.received == k) {
					// k만큼 편지를 받으면 행운의 편지를 보냅니다
					queue.offer(receiver);
				}
			}
		}

		int answer = 0;
		for (Citizen citizen : citizens) {
			if (citizen.isBadBoy) continue; // 악동클럽은 카운트에서 제외해야 합니다.
			if (citizen.received == 0) answer += 1;
		}
		return answer;
	}
}
