package programmers.week4.solved;

import java.util.*;

/*
(1)지문 이해 및 풀이 계획
Topological Sorting (위상정렬) 방식으로 풀이합니다.
최종 수강 강의(k)에 연결되는 강의로만 구성된 그래프로부터 진입차수를 계산합니다.
DFS 방식으로 연결된 그래프만 구성합니다.
문제의 조건에 따라 알파벳 순서대로 적용하기 위해 PriorityQueue를 사용합니다.
그래프와 진입차수 구성을 용이하기 위해 유틸 클래스를 사용했습니다.
ListMap: List를 value로 갖는 Map
CountMap : Integer를 value로 갖는 Map
 */
// String : List<String> 맵 유틸
class ListMap {
	private Map<String, List<String>> map = new HashMap<>();

	List<String> get(String key) {
		if (!map.containsKey(key)) {
			map.put(key, new ArrayList<>());
		}
		return map.get(key);
	}

	void append(String key, String value) {
		get(key).add(value);
	}
}
// String : Integer 맵 유틸
class CountMap {
	private Map<String, Integer> map = new HashMap<>();

	Integer get(String key) {
		if (!map.containsKey(key)) {
			map.put(key, 0);
		}
		return map.get(key);
	}

	void add(String key, Integer value) {
		map.put(key, get(key) + value);
	}
}

public class Solved2 {
	private String[] solution(String[] s1, String[] s2, String k) {
		// 연결 그래프 생성
		ListMap graph = new ListMap();
		for (int i = 0; i < s1.length; i++) {
			graph.get(s2[i]).add(s1[i]); // 강의 -> 선수강의
		}

		Queue<String> queue = new PriorityQueue<>(); // 알파벳 순서대로 정렬되는 큐
		ListMap graphK = new ListMap(); // K로 연결되는 강의로만 구성하는 그래프
		CountMap indegrees = new CountMap(); // 강의:진입차수

		// DFS 방식으로 graphK 를 생성
		Stack<String> stack = new Stack<>();
		Set<String> visited = new HashSet<>();
		stack.push(k);
		visited.add(k);

		while (!stack.isEmpty()) {
			String node = stack.pop();

			if (graph.get(node).isEmpty()) {
				// 진입차수가 없는 강의를 먼저 큐에 삽입
				queue.offer(node);
				continue;
			}

			for (String prev : graph.get(node)) {
				indegrees.add(node, 1); // 진입차수 증가
				graphK.append(prev, node);
				if (visited.contains(prev)) continue;
				stack.push(prev);
				visited.add(prev);
			}
		}

		List<String> answer = new ArrayList<>();
		while (!queue.isEmpty()) {
			String node = queue.poll();
			answer.add(node);
			for (String next : graphK.get(node)) {
				indegrees.add(next, -1);
				if (indegrees.get(next) == 0) {
					// 감소된 진입차수가 0이면 큐에 삽입
					queue.offer(next);
				}
			}
		}

		return answer.toArray(String[]::new);
	}
}
